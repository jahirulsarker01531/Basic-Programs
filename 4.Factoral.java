// using recursion.

public class Simple{
    static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args){
        int n = 5;
        int fac = factorial(n);
        System.out.println("Factorial of "+n+" is: "+fac);
    }
}
