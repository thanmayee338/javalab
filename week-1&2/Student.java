class Student 
{
	int rollno;
	String name,branch;
	int marks;
	void getData(int rollno,String name,String branch,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
		System.out.println("branch:"+branch);
		System.out.println("marks:"+marks);

	}
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.getData(1,"shashi","cse",100);
		s2.getData(2,"saa","cse",120);
		s1.display();
		s2.display();


	}
}
