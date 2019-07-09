package org.adidas.code.challange.rest.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CityDTOTest {
	
	@Test
	public void compareCityDTOTest() {
		// prepare
		CityDTO cityDTO1 = new CityDTO();
		CityDTO cityDTO2 = new CityDTO();
		CityDTO cityDTO3 = new CityDTO("MAD", "Madrid");
		CityDTO cityDTO4 = new CityDTO("MAD", "Madrid");
		CityDTO cityDTO5 = new CityDTO("PAR", "Paris");
		List<CityDistanceDTO> cityDistanceDTOList1 = new ArrayList<>();
		cityDistanceDTOList1.add(new CityDistanceDTO("id", "MAD", "Madrid", "PAR", "Paris", 1500));
		cityDTO5.setDistanceList(cityDistanceDTOList1);
		// test
		assertEquals("CityDTO [id=null, name=null, distanceList=[]]", cityDTO1.toString());
		assertEquals("CityDTO [id=MAD, name=Madrid, distanceList=[]]", cityDTO3.toString());
		assertEquals(cityDTO1, cityDTO2);
		assertEquals(cityDTO3, cityDTO4);
		assertNotEquals(cityDTO1, cityDTO3);
		assertNotEquals(cityDTO3, cityDTO5);
	}

}
