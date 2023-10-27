package business;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTest {
	@Test
	public void listsSizeMock() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());	
	}
	
	@Test
	public void listsSizeMock_ReturnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size()); // fails as it is equals 2
		assertEquals(3, listMock.size()); // it ignores third assert as there is no return
	}
	
	@Test
	public void listsGetMock() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Hello");
		assertEquals("Hello", listMock.get(0));
		assertEquals(null, listMock.get(2));
	}
	
	@Test
	public void listAnyIntMock() {
		List listMock = mock(List.class);
		// Argument Matchers such as anyString, anyObject, anyList, anyCollection
		when(listMock.get(anyInt())).thenReturn("Hey there");
		assertEquals("Hey there", listMock.get(0));
		assertEquals("Hey there", listMock.get(-1));

	}
	// expected=RuntimeException.class doesn't work
	@Test
	public void listThrowsExceptionMock() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenThrow(new RuntimeException("Some Error"));
		assertThrows(RuntimeException.class, () -> listMock.get(0));
	}
	// fails as u have to be give specific or give matchers alone
	@Test
	public void listMatcherVsSpecificMock() {
		List listMock = mock(List.class);
		when(listMock.subList(4, 3)).thenThrow(new ArithmeticException("Error"));
		assertThrows(ArithmeticException.class, () -> listMock.subList(2,3));
	}
}
