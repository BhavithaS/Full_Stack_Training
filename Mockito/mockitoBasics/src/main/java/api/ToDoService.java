package api;

import java.util.List;

// 1. Create ToDoServiceStub
// 2. Test ToDoBusinessImpl using ToDoServiceStub

public interface ToDoService {
	public List<String> retrieveTodos(String user);
	
//	public List<String> configureSomething(String user);
	// for this we need to implement again in stub, which will be a headache	
	
}
