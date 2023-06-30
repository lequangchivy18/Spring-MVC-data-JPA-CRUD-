package vy.com.fa.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vy.com.fa.entity.TTPhiChungCu;


@Repository
public interface TTPhiChungCuRepository extends JpaRepository<TTPhiChungCu, String> {
	
	@Query("SELECT t FROM TTPhiChungCu t")
	Page<TTPhiChungCu> findTTPhiChungCu(Pageable pageable);


//	Page<TTPhiChungCu> findByTenchuhoContaining(String tenchuho, Pageable pageable);
	
	@Query("SELECT t FROM TTPhiChungCu t WHERE t.tenchuho like %?1%")
	Page<TTPhiChungCu> findByTenchuho(String tenchuho, Pageable pageable);
	
}
