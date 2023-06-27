package vy.com.fa.service;


import java.util.List;

import vy.com.fa.entity.TTPhiChungCu;


public interface TTPhiChungCuService {
	void save(TTPhiChungCu chungCu);
	
	List<TTPhiChungCu> findAll();
	
	TTPhiChungCu getById(String id);
}
