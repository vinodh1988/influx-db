package com.influxdb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestService {

	@RequestMapping("/hey")
	public String callme() {
		return "Hello World!!!";
	}
}
