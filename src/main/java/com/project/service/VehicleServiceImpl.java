package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.helpers.dto.VehicleDTO;
import com.project.repository.VehicleRepository;
import javassist.NotFoundException;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository vehicleRepo;

	@Override
	public void deletevehicle(VehicleDTO vehicle) throws NotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	

}
