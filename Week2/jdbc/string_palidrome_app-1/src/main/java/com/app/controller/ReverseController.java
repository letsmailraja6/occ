package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

	@GetMapping("/{data}")
	public String reverseString(@PathVariable String data) {
		return new StringBuilder(data).reverse().toString();
	}
}
