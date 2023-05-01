package com.flower.springboot.service;
import com.flower.springboot.entity.Flower;
import java.util.*;

public interface FlowerService {
	public Flower getFlower(int fCode);
	public List<Flower> getFlowers();
	public void insertFlower(Flower flower);
	public void updateFlower(int fCode,Flower flower);
	public void deleteFlower(int fCode);
}
