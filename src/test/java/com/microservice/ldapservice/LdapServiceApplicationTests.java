package com.microservice.ldapservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LdapServiceApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class LdapServiceApplicationTests {

	@Test
	public void test() {

	}

}