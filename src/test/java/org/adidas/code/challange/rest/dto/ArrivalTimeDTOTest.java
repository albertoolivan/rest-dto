package org.adidas.code.challange.rest.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class ArrivalTimeDTOTest {

	@Test
	public void compareArrivalTimeDTOTest() {
		// prepare
		ArrivalTimeDTO arrivalTimeDTO1 = new ArrivalTimeDTO();
		ArrivalTimeDTO arrivalTimeDTO2 = new ArrivalTimeDTO();
		ArrivalTimeDTO arrivalTimeDTO3 = new ArrivalTimeDTO(LocalDateTime.of(2019, 7, 10, 01, 30), "23:45");
		ArrivalTimeDTO arrivalTimeDTO4 = new ArrivalTimeDTO(LocalDateTime.of(2019, 7, 10, 01, 30), "23:45");
		// test
		assertEquals("ArrivalTimeDTO [arrivalTime=null, durationTime=null]", arrivalTimeDTO1.toString());
		assertEquals("ArrivalTimeDTO [arrivalTime=2019-07-10T01:30, durationTime=23:45]", arrivalTimeDTO3.toString());
		assertEquals(arrivalTimeDTO1, arrivalTimeDTO2);
		assertEquals(arrivalTimeDTO3, arrivalTimeDTO4);
		assertNotEquals(arrivalTimeDTO1, arrivalTimeDTO3);
	}
	
}
