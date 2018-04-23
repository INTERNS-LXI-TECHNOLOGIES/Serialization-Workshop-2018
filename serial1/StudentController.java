import java.io.*;
import java.util.*;
public class StudentController
{
	Student s1=new Student();
	public void takeStudentData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=scan.next();
		s1.setName(name);
		System.out.println("Enter the roll number :");
		int roll=scan.nextInt();
		s1.setRollNo(roll);
		System.out.println("Enter the total mark :");
		int mark=scan.nextInt();
		s1.setTotalMark(mark);
	}
	public void display()
	{
		System.out.println("--------------------------------");
		System.out.println("------Before Serialization------");
		System.out.println("Student name :"+s1.getName());
		System.out.println("Roll Number  :"+s1.getRollNo());
		System.out.println("Total Mark   :"+s1.getTotalMark());
	}
	public void doSerialize()
	{
		try{
		FileOutputStream fo=new FileOutputStream("student.ser");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(s1);
		}
		catch(Exception ex)
		{
			
		}
	}
	
}