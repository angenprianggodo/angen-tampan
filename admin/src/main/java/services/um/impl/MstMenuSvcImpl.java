package services.um.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.um.MstMenuDao;
import entity.um.MstMenu;
import model.um.Menu;
import services.um.MstMenuSvc;

@Service("mstMenuSvc")
@Transactional
public class MstMenuSvcImpl implements MstMenuSvc{

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private MstMenuDao mstMenuDao;
	
	@Override
	public List<Menu> getMenuStructure(){
		List<Menu> menues = new ArrayList<>();
//		List<MstMenu> mstMenu = (List<MstMenu>) mstMenuDao.getMenuStructure();
//		for(MstMenu obj : mstMenu) {
//			Menu mn = new Menu();
//			mn.setMenuCode(obj.getMenuCode());
//			menu.add(mn);
//		}
		
		String sqlRoot = "select xx.menu_code from user_management.mst_menu xx where xx.parent_code is null order by xx.seq";
		Query queryRoot = em.createNativeQuery(sqlRoot);
		List<Object[]> rootObjects = queryRoot.getResultList();
		
		for(Object[] objRoot : rootObjects) {
			String parentCode = (String) objRoot[0];
			
			String sql = 
					"WITH RECURSIVE q AS ( " + 
					"            		 SELECT x.parent_code, x.menu_code, x.menu_name, x.seq, x.type, x.url, x.icon, 1 as lvl " + 
					"                       FROM user_management.mst_menu x " + 
					"                     WHERE x.flag_active = 'Y' " + 
					"            		   and x.menu_code = '"+ parentCode +"'" + 
					"                     UNION ALL " + 
					"                     SELECT m.parent_code, m.menu_code, m.menu_name,  m.seq, m.type, m.url, m.icon, q.lvl + 1 " + 
					"                       FROM user_management.mst_menu m " + 
					"                     JOIN q ON q.menu_code = m.parent_code " + 
					"                     WHERE m.flag_active = 'Y' ) " + 
					"SELECT parent_code, menu_code, menu_name,  seq, type, url, icon, lvl FROM q order by lvl, seq";
			
			
			Query query = em.createNativeQuery(sql);
			List<Object[] >objects = query.getResultList();
			
			int maxLvl = (int) objects.get(objects.size()-1)[7];
			
			for(Object[] obj : objects) {
				Menu menu = new Menu();
				menu.setParentCode(obj[0] == null  ? null : (String) obj[0]);
				menu.setMenuCode((String) obj[1]);
				menu.setMenuName((String) obj[2]);
				menu.setSequence((int) obj[3]);
				menu.setType((String) obj[4]);
				menu.setUrl((String) obj[5]);
				menu.setIcon((String) obj[6]);
				menu.setLvl((int) obj[7]);
				
				for(int i = 1; i <= maxLvl; i++) {
					if(menu.getLvl() == i) {
						menues.add(menu);
					}
				}
				
			}
		}
				
		return menues;
	}
	
	private Menu getParentCode(String code, List<Menu> menuList) {
		Menu m = null;
//		for(m : menuList) {
//			return m;
//			if() {
//				
//			}
//		}
		return m;
	}
	
}
