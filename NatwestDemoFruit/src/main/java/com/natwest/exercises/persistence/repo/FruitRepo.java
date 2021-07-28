package com.natwest.exercises.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.natwest.exercises.persistence.domain.Fruit;


	@Repository
	public interface FruitRepo extends JpaRepository<Fruit, Long> {
	
	@Query(value="select * from fruit where type = ?1", nativeQuery = true)
	List<Fruit> findByType(String type);
	
	
	
}
