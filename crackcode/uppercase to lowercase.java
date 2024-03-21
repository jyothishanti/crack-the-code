import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String upper=sc.nextLine();
		String lower=convertlower(upper);
		System.out.println(lower);
	}
	public static String convertlower(String upper){
	    char[] charArray=upper.toCharArray();
	    for(int i=0;i<charArray.length;i++){
	        if(charArray[i]>='A' && charArray[i]<='Z')
	            charArray[i]=(char)(charArray[i]+32);
	    }
	    return new String (charArray);
	}
	
}

