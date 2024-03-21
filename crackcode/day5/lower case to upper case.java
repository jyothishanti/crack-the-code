import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String lower=sc.nextLine();
		String upper=convertlower(lower);
		System.out.println(upper);
	}
	public static String convertlower(String lower){
	    char[] charArray=lower.toCharArray();
	    for(int i=0;i<charArray.length;i++){
	        if(charArray[i]>='a' && charArray[i]<='z')
	            charArray[i]=(char)(charArray[i]-32);
	    }
	    return new String (charArray);
	}
	
}

