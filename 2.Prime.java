//prime
public class Simple{
    public static void main(String[] args){
        int n = 4;
        if(n<2) System.out.println(n+" is not prime");
        else{
            int count = 0;
        
            for(int i=2; i<n; i++){
                if(n%i==0) System.out.println(n+" is not prime");
                else count++;
            }
            if(count==(n-2)) System.out.println(n+" is prime");
        }
    }
}

//prime(by taking user input & some changes)

import java.util.Scanner;

public class Simple{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        if(isPrime(n)){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime numer");
        }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
