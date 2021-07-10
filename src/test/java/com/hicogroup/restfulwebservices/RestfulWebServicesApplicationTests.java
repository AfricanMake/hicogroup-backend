package com.hicogroup.restfulwebservices;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@WebAppConfiguration
class RestfulWebServicesApplicationTests {

	public static void main(String[] args) {
	}
}
