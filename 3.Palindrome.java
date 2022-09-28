//palindrome using math
public class Simple{
    public static void main(String[] args){
        int n = 150, sum = 0, r;
        int count = n;
        while(n>0){
            r = n%10;
            sum = r + (sum*10);
            n = n/10;
        }
        //System.out.println("Sum is: "+sum);
        if(count == sum){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}

// using string, efficient, can't be use for anything

import java.util.*;
public class Simple{
    public static void main(String[] args){
        String original = "";
        String reverse = "";
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = x.nextLine();

        int length = original.length();

        for(int i=length-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
        }

        if(original.equals(reverse)){
            System.out.println("Entered string/number is a palindrome.");    
        }else{
            System.out.println("Entered string/number isn't a palindrome.");
        }
    }
}

