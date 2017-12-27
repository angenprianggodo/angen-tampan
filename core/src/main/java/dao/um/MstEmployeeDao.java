package dao.um;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.um.MstEmployee;

public interface MstEmployeeDao extends JpaRepository<MstEmployee, Long>{
	
}