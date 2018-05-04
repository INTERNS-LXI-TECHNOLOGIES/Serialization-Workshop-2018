import java.util.regex.*;
import java.io.*;
class Regex
{
public static void main(String args[]) throws Exception
{
	String line;
	File file = new File("E:/workspace/com/lxisoft/certworkss/resume/resume.txt");
	file.createNewFile();
	BufferedReader bf = new BufferedReader(new FileReader(file));
	Pattern p = Pattern.compile("[0-9]{2}[-][0-9]{2}[-][0-9]{4}");
	Pattern p = Pattern.compile("[a-zA-Z]*[@][a-z]*[.][c][o][m]");
	while((line=bf.readLine())!=null)
	{
		
	Matcher data=p.matcher(line);
	if(data.find())
	{
	System.out.print(data.group());
	}
	}
	
//	Pattern p = Pattern.compile()
	
}
}
