package tablePerConcreteClassClient;
import TablePerConcreteClass.TPCAnnotations.*;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

public class StoreData {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("configPackage/hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee e = new Employee();
		e.setName("Sridhar");
		
		RegularEmployee re = new RegularEmployee();
		re.setName("Arjun");
		re.setSalary(10000);
		re.setBonus(5000);
		
		ContractEmployee ce = new ContractEmployee();
		ce.setName("Gowtham");
		ce.setNoOfYears(3);
		ce.setPay(5000);
		
	
		
		session.persist(ce);
		session.persist(re);
		session.persist(e);
		
	
		
		
		
		
		t.commit();
		session.close();
		System.out.println("Successfully Inserted Data");
	}

}
