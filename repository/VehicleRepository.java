package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{
	
	
	
	List<Vehicle> findVehicleByBrand(String brand);
	
	Vehicle findVehicleByIdOrName(Integer id,String name);
	
	List<Vehicle> findVehicleByVehicleType(String vehicleType);
	

	
}
