package com.springboot.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Device;
import com.springboot.model.Devices;

@RestController
@RequestMapping("/apple")
public class Apple {
	
	@GetMapping("/devices")
	public Devices Apple() {
		List<Device> devices = new ArrayList<>();
		Devices devicesList = new Devices(devices);
		devices.add(new Device("iPhone 6s", "iOS", "4gb"));
		devices.add(new Device("macBook 2 pro", "macOS", "8gb"));
		return devicesList;
	}
}
