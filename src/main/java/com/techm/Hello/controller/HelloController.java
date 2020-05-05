package com.techm.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {
@GetMapping("/hello")
public String wish()
{
	return "Hello World";
}
@GetMapping("/add/{name}")
public String addName(@PathVariable String name)
{
	return "Hello"+name;
}
}
