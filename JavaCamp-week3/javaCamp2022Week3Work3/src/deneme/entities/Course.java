package deneme.entities;

public class Course {
	int id;
	String name;
	String category;
	String description;
	String instructor;
	double price;

	public Course(int id, String name, String category, String description, String instructor,double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.instructor = instructor;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
