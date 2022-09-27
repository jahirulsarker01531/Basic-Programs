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

//
