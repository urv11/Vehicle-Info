package com.project.helpers.dto;


public class VehicleDTO {
	
	private Integer id;
	
	private String vehicleType;

	private String name;
	
	private String brand;

	private String fuelType;

	private String maxSpeed;
	
	private String color;
	
	private String dateOfManufacturing;
	
	private String isDeleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	public void setDateOfManufacturing(String dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "VehicleDTO [id=" + id + ", vehicleType=" + vehicleType + ", name=" + name + ", brand=" + brand
				+ ", fuelType=" + fuelType + ", maxSpeed=" + maxSpeed + ", color=" + color + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}
	
	

}
