package vy.com.fa.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import vy.com.fa.entity.TTPhiChungCu;
import vy.com.fa.repository.TTPhiChungCuRepository;
import vy.com.fa.service.TTPhiChungCuService;

@Service
public class TTPhiChungCuServiceImpl implements TTPhiChungCuService{

	@Autowired
	private TTPhiChungCuRepository chungCuRepository;
	
	@Override
	public void save(TTPhiChungCu chungCu) {
		chungCuRepository.save(chungCu);
	}

	@Override
	public Page<TTPhiChungCu> findTTPhiChungCu(Pageable pageable) {
		// TODO Auto-generated method stub
		return chungCuRepository.findTTPhiChungCu(pageable);
	}

	@Override
	public TTPhiChungCu getById(String id) {
		// TODO Auto-generated method stub
		return chungCuRepository.getById(id);
	}

}
