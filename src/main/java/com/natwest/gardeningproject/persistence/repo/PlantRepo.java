package com.natwest.gardeningproject.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.natwest.gardeningproject.persistence.domain.Plant;

@Repository
public interface PlantRepo extends JpaRepository<Plant, Long>	{
	
	@Query(value="SELECT * FROM Plant WHERE name = ?1", nativeQuery=true)
			List<Plant>findByName(String name);
	

}
