package com.customer.springboot.controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.MediaType;

import com.customer.springboot.entity.Flower;
import com.flower.springboot.service.FlowerService;

@RestController
@RequestMapping("/flower-api")
public class FlowerController {
	private FlowerService flowerService;
	public FlowerController() {
		
	}
	@GetMapping(value="/flowers/{fCode}",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Flower getFlower(@PathVariable("Fcode")int fCode) {
		return flowerService.getFlower(fCode);
	}
	@GetMapping(value="/flowers",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Flower> getFlowers(){
		return flowerService.getFlowers();
	}
	@PostMapping(value="/flower",consumes={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void insertFlower(@RequestBody Flower flower) {
		flowerService.insertFlower(flower);
		
	}
	@PutMapping(value="/flower",consumes={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void updateFlower(@PathVariable("Fcode")int fCode,@RequestBody Flower flower) {
		flowerService.updateFlower(fCode, flower);
	}
	@DeleteMapping(value="/flower",consumes={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void deleteFlower(@PathVariable("fCode")int fcode) {
		flowerService.deleteFlower(fcode);
		
	}

}
