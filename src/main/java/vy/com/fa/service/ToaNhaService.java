package vy.com.fa.service;

import vy.com.fa.entity.ToaNha;

public interface ToaNhaService {
	boolean existsById(String matoanha);

	ToaNha getNhaById(String matoanha);
}
