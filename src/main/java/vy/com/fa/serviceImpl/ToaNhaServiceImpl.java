package vy.com.fa.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vy.com.fa.entity.ToaNha;
import vy.com.fa.repository.ToaNhaRepository;
import vy.com.fa.service.ToaNhaService;
@Service
public class ToaNhaServiceImpl implements ToaNhaService{

	@Autowired
	private ToaNhaRepository nhaRepository;
	@Override
	public boolean existsById(String matoanha) {
		// TODO Auto-generated method stub
		return nhaRepository.existsById(matoanha);
	}
	@Override
	public ToaNha getNhaById(String matoanha) {
		// TODO Auto-generated method stub
		return nhaRepository.getNhaById(matoanha);
	}

}
