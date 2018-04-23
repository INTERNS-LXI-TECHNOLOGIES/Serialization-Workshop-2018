import java.io.*;
public class Student implements Serializable
{
	private String name;
	private int rollNo;
	private int totalMark;
	public void setName(String n)
	{
		this.name=n;
	}
	public String getName()
	{
		return this.name;
	}
	public void setRollNo(int r)
	{
		this.rollNo=r;
	}
	public int getRollNo()
	{
		return this.rollNo;
	}
	public void setTotalMark(int tm)
	{
		this.totalMark=tm;
	}
	public int getTotalMark()
	{
		return this.totalMark;
	}
}