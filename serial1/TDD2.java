import java.io.*;
public class TDD2
{
	public static void main(String[] args)throws Exception
	{
		FileInputStream fi=new FileInputStream("student.ser");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Student s=(Student)oi.readObject();
		System.out.println("----------------------------");
		System.out.println("-----After Deserialization-----");
		System.out.println("Student name  :"+s.getName());
		System.out.println("Roll Number   :"+s.getRollNo());
		System.out.println("Total Mark    :"+s.getTotalMark());
	}
}