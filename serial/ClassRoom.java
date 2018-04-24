import java.io.*;
public class ClassRoom implements Serializable
{
	transient private Teacher teacher;
	private int width;
	private int length;
	ClassRoom(Teacher t,int w,int l)
	{
		this.teacher=t;
		this.width=w;
		this.length=l;
	}
	public Teacher getTeacher()
	{
		return this.teacher;
	}
	public int getWidth()
	{
		return this.width;
	}
	public int getLength()
	{
		return this.length;
	}
	private void writeObject(ObjectOutputStream oo)
	{
		try
		{
			oo.defaultWriteObject();
			oo.writeInt(teacher.getId());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	private void readObject(ObjectInputStream oi)
	{
		try
		{
			oi.defaultReadObject();
			teacher=new Teacher(oi.readInt());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
