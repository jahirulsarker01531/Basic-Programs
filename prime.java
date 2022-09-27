//without using method
public class Simple{
    public static void main(String[] args){
        int n = 4;
        if(n==2) {
            System.out.println(n+" is prime");
            
        }else if(n<2) System.out.println(n+" is not prime");
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

