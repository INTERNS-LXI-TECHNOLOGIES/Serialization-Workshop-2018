import java.io.*;
public class TDD
{
	public static void main(String[] args)
	{
		ClassRoom cr;
		Teacher t=new Teacher(1);
		ClassRoom c=new ClassRoom(t,20,30);
		System.out.println("Object before:  teacherName:"+c.getTeacher().getId()+"   class width:"+c.getWidth()+"    class length:"+c.getLength());
		try
		{
			FileOutputStream fo=new FileOutputStream("classrooms.ser");
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(c);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		try
		{
			FileInputStream fi=new FileInputStream("classrooms.ser");
			ObjectInputStream oi=new ObjectInputStream(fi);
			cr=(ClassRoom)oi.readObject();
			System.out.println("Object After:  teacherName:"+cr.getTeacher().getId()+"   class width:"+cr.getWidth()+"    class length:"+cr.getLength());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}