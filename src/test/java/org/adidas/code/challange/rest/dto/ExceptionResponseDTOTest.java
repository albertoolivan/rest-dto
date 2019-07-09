package org.adidas.code.challange.rest.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExceptionResponseDTOTest {

	@Test
	public void compareExceptionResponseDTOTest() {
		// prepare
		ExceptionResponseDTO exceptionResponseDTO1 = new ExceptionResponseDTO("Test Exception");
		ExceptionResponseDTO exceptionResponseDTO2 = new ExceptionResponseDTO("Test Exception", "Exception");
		ExceptionResponseDTO exceptionResponseDTO3 = new ExceptionResponseDTO(new Exception());
		// test
		assertEquals(exceptionResponseDTO1.getMessage(), "Test Exception");
		assertEquals(exceptionResponseDTO1.getException(), "");
		assertEquals(exceptionResponseDTO1.getStackTrace(), "");
		assertEquals("ExceptionResponseDTO [message=Test Exception, exception=, stackTrace=]", exceptionResponseDTO1.toString());

		assertEquals(exceptionResponseDTO2.getMessage(), "Test Exception");
		assertEquals(exceptionResponseDTO2.getException(), "Exception");
		assertEquals(exceptionResponseDTO2.getStackTrace(), "");
		assertEquals("ExceptionResponseDTO [message=Test Exception, exception=Exception, stackTrace=]", exceptionResponseDTO2.toString());

		assertEquals(exceptionResponseDTO3.getMessage(), null);
		assertEquals(exceptionResponseDTO3.getException(), "java.lang.Exception");
		assertTrue(exceptionResponseDTO3.getStackTrace()
				.contains("org.adidas.code.challange.rest.dto.ExceptionResponseDTO"));
	}

}
