package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.controller.Controller;

class TestMyController {

	@Test
	void test() {
	Controller my=new Controller();
	String s=my.greeting();
	assertEquals("Hii", s);
	}
}
