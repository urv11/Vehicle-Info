package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.helpers.constants.VehicleConstants;
import com.project.helpers.dto.VehicleDTO;
import com.project.model.Vehicle;
import com.project.repository.VehicleRepository;
import com.project.service.VehicleService;

import javassist.NotFoundException;

/**
 * @author urveshvinoddhangar
 *
 */

@RestController
public class VehicleController {
	
	@Autowired
	VehicleRepository vehicleRepo;
	
	@Autowired
	VehicleService vehicleService;
	
	
	/**
	 * Get All Vehicles Entity Instance Based On brand
	 * 
	 * @return List Of Vehicle Entities
	 */
	@GetMapping("/vehicles")
	@Async("defaultExecutor")
	public List<Vehicle> getVehicles() {
		
		return vehicleRepo.findAll();
		
	}
	
	/**
	 * Get All Vehicles Entity Instance Based On brand
	 * 
	 * @param brand Brand of the Vehicle Entity Instance
	 * @return Vehicle Entity
	 */
	@GetMapping("/vehicles/brand/{brand}")
	@Async("defaultExecutor")
	public List<Vehicle> getVehiclesByBrand(@PathVariable("brand") String brand) {
		
		return vehicleRepo.findVehicleByBrand(brand);
		
	}
	
	
	/**
	 * Get All Vehicles Entity Instance Based On type
	 * 
	 * @param type Type of the Vehicle Entity Instance
	 * @return Vehicle Entity
	 */
	@GetMapping("/vehicles/type/{type}")
	@Async("defaultExecutor")
	public List<Vehicle> getVehiclesByType(@PathVariable("type") String type) {
		
		return vehicleRepo.findVehicleByVehicleType(type);
		
	}
	
	
	/**
	 * Get One Vehicle Entity Instance
	 * 
	 * @param id Id of the Vehicle Entity Instance
	 * @return Vehicle Entity
	 */
	public Vehicle findOne(Integer id) {
		return vehicleRepo.findVehicleByIdAndIsDeleted(id,VehicleConstants.FALSE);
	}
	
	
	/**
	 * @return Saved Vehicle InstanceS
	 */
	@PostMapping("/vehicle")
	@Async("defaultExecutor")
	public Vehicle addVehicle(@RequestBody Vehicle vehicle)
	{
		return vehicleRepo.save(vehicle);
		
	}
	
	
	/**
	 * @return Updated Vehicle Entity
	 * @throws NotFoundException 
	 */
	@PutMapping("/vehicle/update")
	@Async("defaultExecutor")
	public Vehicle updateVehicle(@RequestBody VehicleDTO vehicle) throws NotFoundException
	{
		Vehicle veh=findOne(vehicle.getId());
		
		if(veh!=null) {
			veh.setColor(vehicle.getColor());
			veh.setMaxSpeed(vehicle.getMaxSpeed());
			return vehicleRepo.save(veh);
		}
		throw new NotFoundException("VEHICLE IS MISSING");
	}
	
	/**
	 * @return 
	 * @return void
	 * @throws NotFoundException 
	 */
	@PostMapping("/vehicle/delete")
	@Async("defaultExecutor")
	public Vehicle deleteVehicle(@RequestBody VehicleDTO vehicle) throws NotFoundException
	{
		Vehicle veh=findOne(vehicle.getId());
		if(veh!=null) {
			veh.setDeleted(VehicleConstants.TRUE);
			return vehicleRepo.save(veh);
		}
		
		throw new NotFoundException("VEHICLE IS MISSING");
		
		
	}
	
}
