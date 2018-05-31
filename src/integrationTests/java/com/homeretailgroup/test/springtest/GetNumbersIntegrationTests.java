package com.homeretailgroup.test.springtest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GetNumbersIntegrationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void getNumber_expectOK() throws Exception {
		final String name = "bob";
		final String number = "123456";

		// Make call to our endpoint
		assertThat(this.testRestTemplate.getForObject("/numbers/?name={name}", String.class, name)).contains(number);
	}

}
