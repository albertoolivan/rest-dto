package org.adidas.code.challange.rest.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CityDistanceDTOTest {

	@Test
	public void compareCityDistanceDTOTest() {
		// prepare
		CityDistanceDTO cityDistanceDTO1 = new CityDistanceDTO();
		CityDistanceDTO cityDistanceDTO2 = new CityDistanceDTO();
		CityDistanceDTO cityDistanceDTO3 = new CityDistanceDTO("id", "MAD", "Madrid", "PAR", "Paris", 1500);
		CityDistanceDTO cityDistanceDTO4 = new CityDistanceDTO("id", "MAD", "Madrid", "PAR", "Paris", 1500);
		// test
		assertEquals("CityDistanceDTO [id=null, cityOriginId=null, cityOriginName=null, cityDestinationId=null, cityDestinationName=null, distanceKm=0]", cityDistanceDTO1.toString());
		assertEquals("CityDistanceDTO [id=id, cityOriginId=MAD, cityOriginName=Madrid, cityDestinationId=PAR, cityDestinationName=Paris, distanceKm=1500]", cityDistanceDTO3.toString());
		assertEquals(cityDistanceDTO1, cityDistanceDTO2);
		assertEquals(cityDistanceDTO3, cityDistanceDTO4);
		assertNotEquals(cityDistanceDTO1, cityDistanceDTO3);
	}
	
}
