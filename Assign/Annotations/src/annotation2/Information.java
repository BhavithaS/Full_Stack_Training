package annotation2;

@Info(authorID = "123",date = "2023-10-12",time = "22:30",version = 1)
public class Information {
	@Info(authorID = "456",date = "2023-10-12",time = "22:35",version = 1,description = "This is a sample property.")
    private int newID;

    @Info(authorID = "789",author = "Hema J",date = "2023-10-12",time = "22:45",version = 1,description = "This is a sample method.")
    public void myMethod() {
        // Method implementation here
    }
}
