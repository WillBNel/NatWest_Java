package com.natwest.exercises.persistence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.natwest.exercises.persistence.domain.Fruit;


@Repository
public interface FruitRepo extends JpaRepository<Fruit, Long> {

	@Query("SELECT f from Fruit f")
	List<Fruit> findAllJPQL();

	@Query(value = "SELECT * from Fruit", nativeQuery = true)
	List<Fruit> findAllSQL();
	
	

	@Query(value = "SELECT f from Fruit f WHERE f.price > ?1")
	List<Fruit> findFruitByPriceGreaterThanJPQL(double price);

	@Query(value = "SELECT * from Fruit WHERE price > ?1", nativeQuery = true)
	List<Fruit> findFruitByPriceGreaterThanSQL(double price);

	@Query(value = "SELECT f from Fruit f WHERE price < ?1")
	List<Fruit> findFruitByPriceLessThanJPQL(double price);

	@Query(value = "SELECT * from Fruit WHERE price <?1", nativeQuery = true)
	List<Fruit> findFruitByPriceLessThanSQL(double price);

	@Query(value = "SELECT f from Fruit f WHERE f.type = ?1")
	List<Fruit> findFruitByTypeJPQL(String type);

	@Query(value = "SELECT * from Fruit WHERE type = ?1", nativeQuery = true)
	List<Fruit> findFruitByTypeSQL(String type);

	@Query("SELECT f from Fruit f WHERE f.type = ?1 and f.price = ?2")
	Fruit findFruitByTypeAndPriceJPQL(String type, double price);

	@Query(value = "SELECT * from Fruit WHERE type = ?1 and price = ?2", nativeQuery = true)
	Fruit findFruitByTypeAndPriceSQL(String type, double price);

	@Query(value = "SELECT f from Fruit f WHERE f.type != NULL")
	List<Fruit> findFruitByTypeIsNotNullJPQL();

	@Query(value = "SELECT * from Fruitn WHERE type IS NOT NULL", nativeQuery = true)
	List<Fruit> findFruitByTypeIsNotNullSQL();

	@Query(value = "SELECT f from Fruit f WHERE f.type = NULL")
	List<Fruit> findFruitByTypeIsNullJPQL();

	@Query(value = "SELECT * from Fruit WHERE type IS NULL", nativeQuery = true)
	List<Fruit> findFruitByTypeIsNullSQL();

	
	

}
