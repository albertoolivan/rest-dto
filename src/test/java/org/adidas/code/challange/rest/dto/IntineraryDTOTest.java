package org.adidas.code.challange.rest.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDateTime;
import java.util.LinkedList;

import org.junit.Test;

public class IntineraryDTOTest {
	
	@Test
	public void compareIntineraryDTOTest() {
		// prepare
		IntineraryDTO intineraryDTO1 = new IntineraryDTO();
		IntineraryDTO intineraryDTO2 = new IntineraryDTO();
		IntineraryDTO intineraryDTO3 = new IntineraryDTO();
		LinkedList<CityDTO> path1 = new LinkedList<>();
		intineraryDTO3.setMessage("Message");
		intineraryDTO3.setPath(path1);
		intineraryDTO3.setSumPathWeight(1);
		intineraryDTO3.setDepartureTime(LocalDateTime.of(2019, 7, 10, 10, 30));
		IntineraryDTO intineraryDTO4 = new IntineraryDTO();
		intineraryDTO4.setMessage("Message");
		intineraryDTO4.setPath(path1);
		intineraryDTO4.setSumPathWeight(1);
		intineraryDTO4.setDepartureTime(LocalDateTime.of(2019, 7, 10, 10, 30));
		// test
		assertEquals("IntineraryDTO [path=[], sumPathWeight=0, message=null, departureTime=null, arrivalTime=null, durationTime=null]", intineraryDTO1.toString());
		assertEquals("IntineraryDTO [path=[], sumPathWeight=1, message=Message, departureTime=2019-07-10T10:30, arrivalTime=null, durationTime=null]", intineraryDTO3.toString());
		assertEquals(intineraryDTO1, intineraryDTO2);
		assertEquals(intineraryDTO3, intineraryDTO4);
		assertNotEquals(intineraryDTO1, intineraryDTO3);
	}

}
