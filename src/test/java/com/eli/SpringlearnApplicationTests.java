package com.eli;

import com.eli.bbp.PasswordDecodable;
import com.eli.factorybean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringlearnApplicationTests {

	@Autowired
	private Person person;

	@Test
	public void testPerson() {
		person.printInfo();
	}


	@Autowired
	private PasswordDecodable passwordDecodable;

	@Test
	public void testPassword() {
		System.out.println(passwordDecodable.getEncodedPassword());
	}
}
