package stringreplace;
import java.util.*;
import java.lang.*;
public class Strcon {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=null;
		String s2=null;
		s1=s.next();
		s2=s.next();
		
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer sb1=new StringBuffer(s2);
		if(s1.length()==s2.length())
		{
			System.out.println(s1+s2);
		}
		else if(sb.length()<sb1.length())
		{
			
			
			for(int i=0;sb.length()<sb1.length();i++)
			{
				
				sb1.deleteCharAt(i);	
			}			
			System.out.println(sb.toString()+sb1.toString());
			
			
		}
		else
		{
			for(int i=0;sb1.length()<sb.length();i++)
			{
				sb.deleteCharAt(i);
				
			}
			System.out.println(sb.toString()+sb1.toString());
		}
		
		s.close();
	}

}
