package vy.com.fa.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import vy.com.fa.entity.TTPhiChungCu;


@Repository
public interface TTPhiChungCuRepository extends JpaRepository<TTPhiChungCu, String> {
	
}
