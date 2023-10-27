package business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import api.ToDoService;
import api.ToDoServiceStub;

class ToDoBusinessImplStubTest {

	@Test
	public void testRetrieveToDosRelatedToSpring_usingAStub() {
		ToDoService toDoServiceStub = new ToDoServiceStub();
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceStub);
		List<String> filteredToDos = toDoBusinessImpl.retrieveToDosRelatedToSpring("R");
		assertEquals(2, filteredToDos.size());
		assertIterableEquals(Arrays.asList("Learn Spring MVC", "Learn Spring"), filteredToDos);
		
	}

}
