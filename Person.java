package com.model;
class Person 
{
	int id;
	String name;
	int age;
	String gender;
	public Person() {}
	public Person(int id, String name, int age, String gender) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
}

class Student extends Person
{
	int admissionNumber;
	int studyStandard;
	public Student() {}
	public Student(int id, String name, int age, String gender, int admissionNumber, int studyStandard) 
	{
		super(id, name, age, gender);
		this.admissionNumber = admissionNumber;
		this.studyStandard = studyStandard;
	}
	public int getAdmissionNumber() 
	{
		return admissionNumber;
	}
	public void setAdmissionNumber(int admissionNumber) 
	{
		this.admissionNumber = admissionNumber;
	}
	public int getStudyStandard() 
	{
		return studyStandard;
	}
	public void setStudyStandard(int studyStandard) 
	{
		this.studyStandard = studyStandard;
	}
}

class PGstudent extends Student
{
	String course;
	int courseDuration;
	public PGstudent() {}
	public PGstudent(int id, String name, int age, String gender, String course, int courseDuration) 
	{
		super(id, name, age, gender, 0, 0);
		this.course = course;
		this.courseDuration = courseDuration;
	}
	public String getCourse() 
	{
		return course;
	}
	public void setCourse(String course) 
	{
		this.course = course;
	}
	public int getCourseDuration()
	{
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) 
	{
		this.courseDuration = courseDuration;
	}
}

class Test
{
	public static void main(String[] args)
	{
		Student s = new Student(1234, "Divya", 16, "Female", 4598, 10 );
		PGstudent pgs = new PGstudent(5553, "Kiran", 22, "Male", "B.Tech", 4 );
		
		//Student properties
		System.out.println("Student ID:             " + s.getId());     //Person property
		System.out.println("Student Name:           " + s.getName());   //Person property
		System.out.println("Student Age:            " + s.getAge());    //Person property
		System.out.println("Student Gender:         " + s.getGender()); //Person property
		System.out.println("Student Admission No:   " + s.getAdmissionNumber());
		System.out.println("Standard Studying:      " + s.getStudyStandard());
		System.out.println("------------------------------------");
		//PGstudent Properties
		System.out.println("PGStuden ID:            " + pgs.getId());     //Person property
		System.out.println("PGStudent Name:         " + pgs.getName());   //Person property
		System.out.println("PGStudent Age:          " + pgs.getAge());    //Person property
		System.out.println("PGStudent Gender:       " + pgs.getGender()); //Person property
		System.out.println("PGStudent Course:       " + pgs.getCourse());
		System.out.println("PGStandard Course Duration:" + pgs.getCourseDuration());
		
	}
}
