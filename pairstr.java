import java.util.*;
public class Pairstar {

	public static void main(String[] args) {
		String str="aaaa";
		String str1=str;
		StringBuilder sb=new StringBuilder(str);
		
		
		for (int i=0,j=1;i<=str.length();i++,j++)
		{
			char[] c=str1.toCharArray();
		
			
			if(c[i]==c[j])
			{
				sb.insert(j,"*");
				str1=sb.toString();
				System.out.println(str1);
			}
			
		}
		
		
	}

}
