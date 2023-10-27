package business;

import java.util.ArrayList;
import java.util.List;

import api.ToDoService;
// here business Impl depends on the ToDoService
public class ToDoBusinessImpl {
	private ToDoService toDoService;

	public ToDoBusinessImpl(ToDoService toDoService) {
		this.toDoService = toDoService;
	}
	
	public List<String> retrieveToDosRelatedToSpring(String user){
		List<String> filteredToDos = new ArrayList<String>();
		List<String> toDos = toDoService.retrieveTodos(user); // dependency
		for(String toDo : toDos) {
			if(toDo.contains("Spring")) {
				filteredToDos.add(toDo);
			}
		}
		return filteredToDos;
	}
	
}
