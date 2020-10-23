package com.influxdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;

@SpringBootApplication
public class InfluxPushApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfluxPushApplication.class, args);
		peopleOnline();
	}
  
	
	public static void peopleOnline() {
		while(true) {
			try {
				long online =(long)(Math.random()*1000);
				  // their values
			    Counter counter =Metrics.counter("online.users",  "users",    
			           String.valueOf(online), "type", "user");   
			    
				Thread.sleep(30000);
			}
			catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}
