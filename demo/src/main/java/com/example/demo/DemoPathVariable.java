package com.example.demo;


import java.util.Date;

import javax.validation.Valid;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoPathVariable {
	
	//http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/50
		@GetMapping("/data/{since}")
		public String convertCurrency(@Valid @PathVariable("since") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
			System.out.println("date value "+date);
			return "date execution";
		}

}
