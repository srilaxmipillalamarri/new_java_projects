package com.flower.springboot.service;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.customer.springboot.entity.Flower;
import com.customer.springboot.repository.*;
@Service
public class FlowerServiceImpl implements FlowerService{
	@Autowired
	private FlowerRepository flowerRepository;
	public FlowerServiceImpl() {
		
	}
	public Flower getFlower(int fCode) {
		return flowerRepository.findById(fCode).get();
	}
	public List<Flower> getFlowers(){
		return flowerRepository.findAll();
	}
	public void insertFlower(Flower flower) {
		flowerRepository.save(flower);
	}
	public void updateFlower(int fCode,Flower flower) {
		flowerRepository.save(flower);
	}
	public void deleteFlower(int fCode) {
		flowerRepository.deleteById(fCode);
		
	}

}
