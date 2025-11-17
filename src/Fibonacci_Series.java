import java.util.Scanner;

public class Fibonacci_Series {
    static int fibc(int n)
    {
        if (n<=1)
            return n;

        return fibc(n-1)+ fibc(n-2);
    }
    public static void main(String []args)
    {
        int i=0,limit;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the limit for fibonacci series:");
        limit=s.nextInt();
        for(i=0;i<limit;i++)
            System.out.println(fibc(i) + " ");
    }
}
