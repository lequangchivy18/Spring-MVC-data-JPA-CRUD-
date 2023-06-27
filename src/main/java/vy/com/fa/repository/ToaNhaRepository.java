package vy.com.fa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vy.com.fa.entity.ToaNha;

@Repository
public interface ToaNhaRepository extends CrudRepository<ToaNha, String>{
	
	@Query("SELECT u FROM ToaNha u WHERE u.id = ?1")
	ToaNha getNhaById(String matoanha);
}
