package FAQProgram;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String name="Pradeep";
        System.out.println("Name :"+name);
        String reverseName=null;
        char temp;
        char[] revStr=name.toCharArray();
        for(int i=0,j=name.length()-1;i<j;i++,j--){
            temp=revStr[i];
            revStr[i]=revStr[j];
            revStr[j]=temp;
        }
        reverseName=new String(revStr);
        System.out.println("Reversed name : "+ reverseName);
        reverseName= Arrays.toString(revStr);
        System.out.println("Reversed name : "+ reverseName);
    }
}
