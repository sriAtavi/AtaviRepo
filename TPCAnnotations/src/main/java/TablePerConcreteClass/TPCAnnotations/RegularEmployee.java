package TablePerConcreteClass.TPCAnnotations;
import javax.persistence.*;

@Entity
@Table (name = "RegularEmployee")
@AttributeOverrides({
	@AttributeOverride(name = "id" , column=@Column(name="id")),
	@AttributeOverride(name = "name", column = @Column(name = "name")) 
}) //for TPC we should mention as which column will override the Parent's Column by using @AttributeOverride
public class RegularEmployee extends Employee{

	@Column(name = "Salary")
	float salary;
	
	@Column(name = "Bonus")
	int bonus;
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
