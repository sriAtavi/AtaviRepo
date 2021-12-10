package TablePerConcreteClass.TPCAnnotations;
import javax.persistence.*;

@Entity
@Table (name = "ContractTable")
@AttributeOverrides({
	@AttributeOverride(name = "id" , column=@Column(name="id")),
	@AttributeOverride(name = "name", column = @Column(name = "name")) 
	})

public class ContractEmployee extends Employee{

	@Column(name = "No_of_years")
	int noOfYears;
	
	@Column(name = "pay")
	int pay;
	
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
