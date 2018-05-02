package scjptest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tdd {

	public static void main(String[] args) {
		String[] ph=null;
		// TODO Auto-generated method stub
		try{
			File f=new File("resume.txt");
			BufferedReader br=new BufferedReader(new FileReader(f));
			String s;
			while(br.readLine()!=null){
				s=br.readLine();
				Pattern p=Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
				Matcher m=p.matcher(s);
				while(m.find()){
					System.out.println(m.group());
				}
				Pattern p1=Pattern.compile("^([\\w/.]+)@([\\w]+)$");
				Matcher m1=p1.matcher(s);
				while(m1.find()){
					System.out.println(m.find());
					System.out.println(m1.group());
				}
				
			}
			//System.out.println(ph);
		}
		catch(Exception e){
			//e.printStackTrace();
		}
	}

}
