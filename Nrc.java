package stringreplace;
import java.util.*;
public class Nrc {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		String str;
		int count=0;
		str=s.next();
		char[] c= str.toCharArray();
		for(int i=0,j=1;j<str.length();i++,j++)
		{
			
				if (c[i]==c[j])
				{
					
				}
				else
				{
					count++;
				}
			
		}
		System.out.println(count);
		s.close();
	}

}
