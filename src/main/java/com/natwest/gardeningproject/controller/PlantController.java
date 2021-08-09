package com.natwest.gardeningproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.gardeningproject.persistence.domain.Plant;
import com.natwest.gardeningproject.service.PlantService;

@RestController
@CrossOrigin
public class PlantController {
	
	public PlantController() {
		
	}
	
	@Autowired
	private PlantService service;
	
	@GetMapping("/read")
	public ResponseEntity<List<Plant>> getAll(){
		return new ResponseEntity<List<Plant>>(this.service.readAll(), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Plant> createPlant(@RequestBody Plant plant){
		return new ResponseEntity<Plant>(this.service.createPlant(plant), HttpStatus.CREATED);
	}
	
	@GetMapping("/findbyid/{id}")
	public ResponseEntity<Plant> findById (@PathVariable ("id") Long id){
		return new ResponseEntity<Plant>(this.service.findById(id), HttpStatus.FOUND);
	}
		
	@PutMapping("update/{id}")
	public ResponseEntity<Plant> update (@PathVariable("id") Long id, @RequestBody Plant plant){
		return new ResponseEntity<Plant>(this.service.updatePlant(id, plant), HttpStatus.ACCEPTED);
	}
		
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete (@PathVariable Long id){
		return new ResponseEntity<Boolean>(this.service.deletePlant(id), HttpStatus.NO_CONTENT);
	}
	
	
}

