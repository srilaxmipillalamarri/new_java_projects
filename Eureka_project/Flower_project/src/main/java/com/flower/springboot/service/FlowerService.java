package com.flower.springboot.service;
import java.util.*;

import com.customer.springboot.entity.Flower;

public interface FlowerService {
	public Flower getFlower(int fCode);
	public List<Flower> getFlowers();
	public void insertFlower(Flower flower);
	public void updateFlower(int fCode,Flower flower);
	public void deleteFlower(int fCode);
}
