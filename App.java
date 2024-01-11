package com.hibernate.curd.HIBERNATE_CURD;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		System.out.println( " Project started !" );

		
		
		Homedetails hd=new Homedetails();
		hd.sethId(1);
		hd.sethSal(0000);
		hd.sethName("MANU");
		hd.setHjob("JOBLESS");
		
		Homedetails hd1=new Homedetails();
		hd1.sethId(2);
		hd1.sethSal(39000);
		hd1.sethName("Venu");
		hd1.setHjob("info");
		
		Homedetails hd2=new Homedetails();
		hd2.sethId(3);
		hd2.sethSal(2500);
		hd2.sethName("ANU");
		hd2.setHjob("culture");

		Homedetails hd3=new Homedetails();
		hd3.sethId(4);
		hd3.sethSal(2500);
		hd3.sethName("MUNI");
		hd3.setHjob("culture");
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Homedetails.class);
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tran=sess.beginTransaction();
		
		
		List<Homedetails> homelists=new ArrayList<Homedetails>();
		homelists.add(hd);
		homelists.add(hd1);
		homelists.add(hd3);
		homelists.add(hd2);
		
		
		for(Homedetails list : homelists)
		{
			sess.save(list);
		
		}
		
		
		// fetch 
		
//		 hd=(Homedetails)sess.load(Homedetails.class, 1);
//		System.out.println(hd);
//		 hd1=(Homedetails)sess.load(Homedetails.class, 2);
//			System.out.println(hd1);
//			 hd2=(Homedetails)sess.load(Homedetails.class, 3);
//				System.out.println(hd2);
//				 hd3=(Homedetails)sess.load(Homedetails.class, 4);
//					System.out.println(hd3);
		
		
		// delete 
		// to delete 1 row of the Homedetails
		
		sess.delete(hd);
		
		
		tran.commit();
		sess.close();
		



	}
}
