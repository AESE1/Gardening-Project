package com.natwest.gardeningproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.natwest.gardeningproject.persistence.domain.Plant;
import com.natwest.gardeningproject.persistence.repo.PlantRepo;

@Service
public class PlantService {
	
	public PlantRepo repo;

	
	public PlantService (PlantRepo repo) {
		super();
		this.repo = repo;
		
	}

//	READ
	public List<Plant> readAll (){
		return this.repo.findAll();
	}
	
//	FIND
	public Plant findById(Long id) {
		return this.repo.findById(id).orElseThrow();
		
	}
	
//	CREATE
	public Plant createPlant(Plant plant) {
		return this.repo.saveAndFlush(plant);
	}
	
//	UPDATE
	public Plant updatePlant(Long id, Plant plant) {
		Plant exists = this.repo.getById(id);
		exists.setVariegated(plant.getVariegated());
		exists.setName(plant.getName());
		exists.setPrice(plant.getPrice());
		Plant updated = this.repo.save(exists);
		return updated;
	}
	
//	DELETE
	public Boolean deletePlant(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
		
	}
}