package services.um.impl;

import java.util.ArrayList;
import java.util.List;

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
		List<Menu> menu = new ArrayList<>();
//		List<MstMenu> mstMenu = (List<MstMenu>) mstMenuDao.getMenuStructure();
//		for(MstMenu obj : mstMenu) {
//			Menu mn = new Menu();
//			mn.setMenuCode(obj.getMenuCode());
//			menu.add(mn);
//		}
		
		
		
		String sql = 
				"with temp as  ( select menu_code, parent_code "
				 + " from user_management.mst_menu "
				 + " where type = 'dropdown' order by seq "
				+ " )  select * from user_management.mst_menu a "
				+ " left join temp b " 
				+ " on a.parent_code = b.menu_code";
		Query query = em.createNativeQuery(sql, MstMenu.class);
		List<MstMenu> mstMenuList = query.getResultList();
		for(MstMenu obj : mstMenuList) {
			Menu mn = new Menu();
			mn.setMenuCode(obj.getMenuCode());
			mn.setParentCode(obj.getParentCode());
			menu.add(mn);
		}
				
		return menu;
	}
	
}
