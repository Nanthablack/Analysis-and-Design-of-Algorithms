import java.util.*;
class fibonacci
{
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
    System.out.print("Enter your M : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Your Fibonacci is "+fib(n));
    }
    
}