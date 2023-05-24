package FAQProgram;

public class FabonnacciRecurtion {
    public static void main(String[] args) {
        int n = 9;
        for(int i=0;i<n;i++) {
            System.out.print(fib(i) +",");
        }
        System.out.println("Febonacci Series from iteraion: ");
        feb(10);
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    static void feb(int maxNumber)
    {
        int previousNumber = 0, nextNumber = 1;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        int i=1;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }

    }

}
