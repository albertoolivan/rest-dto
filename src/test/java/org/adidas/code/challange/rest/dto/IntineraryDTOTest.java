package org.adidas.code.challange.rest.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		IntineraryDTO intineraryDTO4 = new IntineraryDTO();
		intineraryDTO4.setMessage("Message");
		intineraryDTO4.setPath(path1);
		intineraryDTO4.setSumPathWeight(1);
		// test
		assertEquals("IntineraryDTO [path=[], sumPathWeight=0, message=null]", intineraryDTO1.toString());
		assertEquals("IntineraryDTO [path=[], sumPathWeight=1, message=Message]", intineraryDTO3.toString());
		assertEquals(intineraryDTO1, intineraryDTO2);
		assertEquals(intineraryDTO3, intineraryDTO4);
		assertNotEquals(intineraryDTO1, intineraryDTO3);
	}

}
