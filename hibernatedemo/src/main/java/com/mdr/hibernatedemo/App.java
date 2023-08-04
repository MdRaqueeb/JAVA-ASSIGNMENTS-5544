package com.mdr.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import com.mdr.hibernate.dao.EmployeeDAO;
import com.mdr.hibernate.entity.Address;
import com.mdr.hibernate.entity.Employee;
import com.mdr.hibernate.entity.Person;
import com.mdr.hibernate.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = HibernateUtil.buildSessionFactory();
        Session session = factory.openSession();
        Person p = session.get(Person.class, 787);
        if(p!=null)
        {
        	System.out.println(p.getSsn()+"   "+p.getPersonName()+"   "+p.getPersonAge()+"   "+p.getGender());
        	System.out.println(p.getAddress().getHouseno()+"   "+p.getAddress().getStreetName());
        	System.out.println(p.getAddress().getCityName()+"   "+p.getAddress().getStateName());
        }
        Address a = session.get(Address.class, 7001);
        if(a!=null)
        {
        	System.out.println(a.getHouseno()+"   "+a.getStreetName());
        	System.out.println(a.getCityName()+"   "+a.getStateName());
        	System.out.println(a.getPerson().getSsn()+"   "+a.getPerson().getPersonName());
        	System.out.println(a.getPerson().getPersonAge()+"   "+a.getPerson().getGender());
        }
        session.close();
        HibernateUtil.shutdown();
    }
}


// Inserting elemnets

//SessionFactory factory = HibernateUtil.buildSessionFactory();
//Session session = factory.openSession();
//Employee e = new Employee(105,"Mariana", 5000,50); //upto 5elements
//Transaction trans = session.beginTransaction();
//session.save(e);
//trans.commit();
//session.close();
//HibernateUtil.shutdown();




// Fetching particular Element Data

//{
//    SessionFactory factory = HibernateUtil.buildSessionFactory();
//	Session session = factory.openSession();
//    Employee e = session.get(Employee.class,102);
//    if(e!=null)
//    	System.out.println(e.getEmployeeName()+"    "+e.getSalary()+"    "+e.getDepartmentNo());
//    else
//    	System.out.println("Employee with Id 102 does not exist");
//    session.close();
//    HibernateUtil.shutdown();
//}


//Is the Session Dirty or not

//{
//    SessionFactory factory = HibernateUtil.buildSessionFactory();
//    Session session = factory.openSession();
//    Transaction trans = session.beginTransaction();
//    Employee e = session.get(Employee.class,102);
//    if(e!=null)
//    	e.setEmployeeName("Babu Raja");
//    System.out.println("Is session Dirty"+session.isDirty());
//    trans.commit();
//    System.out.println("Is session Dirty"+session.isDirty());
//    session.close();
//    HibernateUtil.shutdown();
//}




//Directly updating elements in the DBMS

//{
//    SessionFactory factory = HibernateUtil.buildSessionFactory();
//    Session session = factory.openSession();
//    Transaction trans = session.beginTransaction();
//    Employee e = new Employee(102,"New Babu",2200,20);
//    session.update(e);
//    trans.commit();
//    session.close();
//    HibernateUtil.shutdown();
//}


//saving or updating the record 

//{
//    SessionFactory factory = HibernateUtil.buildSessionFactory();
//    Session session = factory.openSession();
//    Transaction trans = session.beginTransaction();
//    Employee e = new Employee(102,"Babu Raja",2200,20);
//    session.saveOrUpdate(e);
//    trans.commit();
//    session.close();
//    HibernateUtil.shutdown();
//}


//Deleting particular element Row directly into DB

//{
//    SessionFactory factory = HibernateUtil.buildSessionFactory();
//    Session session = factory.openSession();
//    Transaction trans = session.beginTransaction();
//    Employee e = new Employee();
//    e.setEmployeeId(102);
//    session.delete(e);
//    trans.commit();
//    session.close();
//    HibernateUtil.shutdown();
//}


//OR

//{
//    SessionFactory factory = HibernateUtil.buildSessionFactory();
//    Session session = factory.openSession();
//    Transaction trans = session.beginTransaction();
//    Employee e = session.get(Employee.class,102);
//    if(e!=null)
//    	session.delete(e);
//    else
//    	System.out.println("Employee with Id 102 does not exist");
//    trans.commit();
//    session.close();
//    HibernateUtil.shutdown();
//}


//Something

//public static void main( String[] args )
//{
//    SessionFactory factory = HibernateUtil.buildSessionFactory();
//    Session session = factory.openSession();
//  //  Transaction trans = session.beginTransaction();
//    Employee e1 = session.get(Employee.class,101);
//    Employee e2 = session.get(Employee.class,101);
//    
//    session.close();
//    HibernateUtil.shutdown();
//}


//Something 2

//public static void main( String[] args )
//{
//    SessionFactory factory = HibernateUtil.buildSessionFactory();
//    EmployeeDAO edao = new EmployeeDAO(factory);
//    edao.insertEmployee(new Employee(104,"Dinesh Karthick",4000,40));
//    Employee e = edao.getEmployee(103);
//    if(e!=null)
//    	System.out.println(e.getEmployeeName()+"    "+e.getSalary()+"    "+e.getDepartmentNo() );
//
//    HibernateUtil.shutdown();
//}