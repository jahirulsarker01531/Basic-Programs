//default range 0.0(inclusive) to 1.0(exclusive).
import java.lang.Math;
public class Simple{
    public static void main(String[] args){
        System.out.println("random1: "+Math.random());
        System.out.println("random2: "+Math.random());
        System.out.println("random3: "+Math.random());
        System.out.println("random4: "+Math.random());
        System.out.println("random5: "+Math.random());
        System.out.println("random6: "+Math.random());
        System.out.println("random7: "+Math.random());
    }
}

// range min(inclusive) to max(exclusive) using a formulae.

public class Simple{
    public static void main(String[] args){
        int min = 200;
        int max = 400;
        System.out.println("Random value of type double between "+min+" to "+max+": ");
        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);
        System.out.println("Random value of type int between "+min+" to "+max+": ");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
