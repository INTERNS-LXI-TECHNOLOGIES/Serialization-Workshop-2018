import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
class CheckDate
{
public static void main(String args[])
{
  Date d = new Date();
  System.out.println(d.toString());
  Date d1 = new Date(67000000000L);
  d1.setTime((d1.getTime()+360000000L));
  System.out.print(d1.toString());
  Calendar c = Calendar.getInstance();
  Date d2 = c.getTime();
  System.out.print(d2.toString());
  if(Calendar.SUNDAY==c.getFirstDayOfWeek())
  {
	  System.out.println("Sunday");
	  
  }
  System.out.print(c.get(Calendar.YEAR));
  System.out.print(c.getMaximum(Calendar.DAY_OF_WEEK));
  c.add(Calendar.MONTH,-8);
  System.out.print(c.getTime());
  DateFormat df = DateFormat.getDateInstance();
  String s  = df.format(c.getTime());
  try{
  System.out.print(df.parse(s));
  }catch(ParseException e){e.printStackTrace();}
  
  
  
}
}