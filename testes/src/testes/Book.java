package testes;


//books
public class Book {

	private String name;
	private String author;
	
	public String getAuthor() {
		return author;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Book (String name, String author) {
		
		this.author = author;
		this.name = name;
		
		
		
		
	}
	
	
	public boolean hasAuthor(String string) {
		return author.contains(name);
			
	}
	
	
	@Override
	public String toString() {
		return "\nlivro :" + name + "\nauthor" + author;
		
		
	}
	
	
	
	
	
	
	
}
