package dao.um;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.um.MstMenu;

public interface MstMenuDao extends JpaRepository<MstMenu, Long>{
	
//	@Query(" with temp as ( "
//			+ " select a.menuCode, a.parentCode "
//			+ " from MstMenu a "
//			+ " where a.type = 'dropdown' order by a.seq "
//			+ " )  select a from MstMenu a "
//			+ " left join temp b "
//			+ " on a.parentCode = b.menuCode ")
//	public MstMenu getMenuStructure();
	
	
}
