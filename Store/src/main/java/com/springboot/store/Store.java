package com.springboot.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.model.Devices;

@Controller
public class Store {

	ModelAndView mav;
	Devices result;

	@Autowired
	RestTemplate restTemplate;

//	private final DiscoveryClient discoveryClient;
//
//	public Store(DiscoveryClient discoveryClient) {
//		this.discoveryClient = discoveryClient;
//	}

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/{brandName}")
	public ModelAndView listOfDevices(@PathVariable("brandName") String brandName) {

		switch (brandName.toLowerCase()) {
		case "samsung":
			mav = new ModelAndView("viewDevices");
//			String samsungServiceName = "SAMSUNG"; // Logical service name
//			String samsungServiceUrl = getServiceUrl(samsungServiceName); // Get actual URL using Eureka client
//			result = restTemplate.getForObject(samsungServiceUrl + "/samsung/devices", Devices.class);
			result = restTemplate.getForObject("http://SAMSUNG/samsung/devices", Devices.class);
			mav.addObject("devices", result);
			return mav;

		case "apple":
			mav = new ModelAndView("viewDevices");
//			String appleServiceName = "APPLE"; // Logical service name
//			String appleServiceUrl = getServiceUrl(appleServiceName); // Get actual URL using Eureka client
//			result = restTemplate.getForObject(appleServiceUrl + "/apple/devices", Devices.class);
			result = restTemplate.getForObject("http://APPLE/apple/devices", Devices.class);
			mav.addObject("devices", result);
			return mav;

		default:
			return new ModelAndView("redirect: /error");
		}
	}

	// Helper method to get the actual service URL from Eureka client
//	private String getServiceUrl(String serviceName) {
//		return discoveryClient.getInstances(serviceName).stream().findFirst()
//				.map(instance -> instance.getUri().toString())
//				.orElseThrow(() -> new IllegalStateException("Service not found: " + serviceName));
//	}

	// Other methods and mappings in the controller

}
