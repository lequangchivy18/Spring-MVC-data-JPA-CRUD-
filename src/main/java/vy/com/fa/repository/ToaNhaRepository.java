package vy.com.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vy.com.fa.entity.ToaNha;

@Repository
public interface ToaNhaRepository extends JpaRepository<ToaNha, String> {

	@Query("SELECT u FROM ToaNha u WHERE u.id = ?1")
	ToaNha getNhaById(String matoanha);
}
