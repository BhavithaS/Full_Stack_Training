package api;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService{

	public List<String> retrieveTodos(String user) {
//		if(user.equals("Dummy1")
//				return  // it'll become complex to add on code
		
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
		
		// 1. when u want to return different type of return under conditions it become complex code i.e. large
		// 2. with changes in interface you need to update this as well 	
	}
	

}
