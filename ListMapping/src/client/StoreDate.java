package client;
import persistantPackage.*;
import java.util.*;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

public class StoreDate {

	public static void main(String[] args)
	{
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("configPackage/hibernate.cfg.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("atavi");
	list1.add("gowda");
	
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("sri");
	list2.add("dhara");
	
	Person p = new Person();
	p.setName("Sridhar");
	p.setAliases(list1);
	
	Person p1 = new Person();
	p1.setName("sridhar");
	p1.setAliases(list2);
	
	session.persist(p);
	session.persist(p1);
	t.commit();
	session.close();
	System.out.println("Successfully inserted Data");
	 
	}	
}
