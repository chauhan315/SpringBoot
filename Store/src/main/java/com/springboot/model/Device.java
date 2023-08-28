package com.springboot.model;

public class Device {

	private String name;
	private String type;
	private String ram;

	public Device() {
		
	}

	

	public Device(String name, String type, String ram) {
		this.name = name;
		this.type = type;
		this.ram = ram;
	}



	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Device [name=" + name + ", type=" + type + ", ram=" + ram + "]";
	}
	
	

}
