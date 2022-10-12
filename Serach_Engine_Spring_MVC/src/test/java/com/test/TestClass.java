package com.test;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.TestMethodOrder;
@SuppressWarnings("deprecation")
@TestMethodOrder(Alphanumeric.class)
public class TestClass {
	@Test
	public void add3Emp() {
		System.out.println("Add Employee");
	}

	@Test
	public void update2Emp() {
		System.out.println("Update Employee");
	}

	@Test
	public void delete1Emp() {
		System.out.println("Deletee Employee");
	}
}
