package Generalq.stringTests;

public class NullStringTest {
    public static void main(String[] args) {
        String str=null;
        if(null==str || str.isEmpty() )
            System.out.println("null String and empty string");
        else
            System.out.println("non null String");
    }
}
