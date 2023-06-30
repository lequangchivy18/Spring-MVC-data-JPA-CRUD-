package vy.com.fa.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import vy.com.fa.entity.TTPhiChungCu;


public interface TTPhiChungCuService {
	void save(TTPhiChungCu chungCu);
	
	Page<TTPhiChungCu> findTTPhiChungCu(Pageable pageable);
	
	TTPhiChungCu getById(String id);
	
	Page<TTPhiChungCu> findByTenchuhoLike(String searchKey, Pageable pageable);
}
