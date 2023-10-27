package business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import api.ToDoService;

public class ToDoBusinessImplMockTest {

	@Test
	public void testRetrieveToDosRelatedToSpring_usingAMock() {
		ToDoService toDoService = mock(ToDoService.class);
		List<String> toDos = Arrays.asList("Learn Spring MVC", "Learn Spring","Learn to Dance");
		when(toDoService.retrieveTodos("Ravi")).thenReturn(toDos);
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoService);
		List<String> filteredToDos = toDoBusinessImpl.retrieveToDosRelatedToSpring("Ravi");
		assertEquals(2, filteredToDos.size());
		
	}
	
	@Test
	public void testRetrieveToDosRelatedToSpring_usingEmptyList() {
		ToDoService toDoService = mock(ToDoService.class);
		List<String> toDos = Arrays.asList();
		when(toDoService.retrieveTodos("Ravi")).thenReturn(toDos);
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoService);
		List<String> filteredToDos = toDoBusinessImpl.retrieveToDosRelatedToSpring("Ravi");
		assertEquals(0, filteredToDos.size());
		
	}

}