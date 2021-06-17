package com.project.service;

import com.project.helpers.dto.VehicleDTO;

import javassist.NotFoundException;


public interface VehicleService {

	void deletevehicle(VehicleDTO vehicle) throws NotFoundException;

}
