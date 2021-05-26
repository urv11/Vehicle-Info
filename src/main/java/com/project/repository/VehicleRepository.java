package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{
	
	List<Vehicle> findVehicleByBrand(String brand);
	
	Vehicle findVehicleByIdAndIsDeleted(Integer id,boolean isDeleted);
	
	List<Vehicle> findVehicleByVehicleType(String vehicleType);
	
	
}
