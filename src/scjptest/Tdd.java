package scjptest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tdd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		try{
			File f=new File("resume.txt");
			br=new BufferedReader(new FileReader(f));
			String s;
			while((s=br.readLine())!=null){
				Pattern p=Pattern.compile("\\d{10}");		
				Matcher m=p.matcher(s);
				while(m.find()){
					System.out.println("Mobile number matched "+m.group());
				}
				Pattern p1=Pattern.compile("([\\w/.]+)@([\\w]+).[(com)/(in)]{2,4}");
				Matcher m1=p1.matcher(s);
				while(m1.find()){
					//System.out.println(m1.find());
					System.out.println("MAil id matched"+m1.group());
				}
				Pattern p2=Pattern.compile("(0?[1-9]|[12][1-9]|[3][01])/(0?[1-9]|[1][12])/19?[0-99]{2}");		
				Matcher m2=p2.matcher(s);
				while(m2.find()){
					System.out.println("matched date is"+m2.group());
				}
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			br.close();
		}
	}

}
