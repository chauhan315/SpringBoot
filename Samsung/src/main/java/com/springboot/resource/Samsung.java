package com.springboot.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.samsung.model.Device;
import com.springboot.samsung.model.Devices;

@RestController
@RequestMapping("/samsung")
public class Samsung {
	
	@GetMapping("/devices")
	public Devices getDevices(){
		List<Device> devices = new ArrayList<>();
		Devices devicesList = new Devices(devices);		
		devices.add(new Device("Samsung S22 Ultra", "Android", "24gb"));
		devices.add(new Device("Samsung Note 9", "Android", "16gb"));
		return devicesList;
	}
}
