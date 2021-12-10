package TablePerConcreteClass.TPCAnnotations;
import javax.persistence.*;

@Entity
@Table (name = "Employee")
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)  //Table Per Concrete class Annotation
public class Employee {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	int id;
	
	@Column(name="name")
	String name;
	
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
	
	
}
