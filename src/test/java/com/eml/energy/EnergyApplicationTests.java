package com.eml.energy;

import org.theenergymashuplab.cts.controller.payloads.EiCreateTenderType;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EnergyApplicationTests {

	@Autowired
	private EiCreateTenderType ctt;

	@Test
	@DisplayName("Integration test which will get the actual output of text service")
	public void contextLoads() {
		assertEquals(ctt.home(), "In test. Working!");
	}

}
