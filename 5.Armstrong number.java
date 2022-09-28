import java.util.Scanner;
import java.lang.Math;
public class Simple{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        n = sc.nextInt();

        for(int i=0; i<=n; i++){
            int x = i, y = i, length=0, ans = 0, r;
            while(x>0){
                x/=10;
                length++;
            }
            while(y>0){
                r = y%10;
                ans += Math.pow(r,length);
                y = y/10;
            }
            if(ans==i){
                System.out.println(ans);
            }
        }
    }    
}
