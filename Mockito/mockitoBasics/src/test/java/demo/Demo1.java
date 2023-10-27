package demo;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class Demo1 {
	
	@Test
	public void demo() {
		List<String> mockedList = mock(List.class);

		 //using mock object
		 mockedList.add("one");
		 mockedList.clear();

		 //verification
		 verify(mockedList).add("one");
		 verify(mockedList).clear();
	}
	
}
