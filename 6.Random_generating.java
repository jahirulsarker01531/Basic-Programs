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

//using random class

import java.util.Random;
public class Simple{
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(50);
        int y = random.nextInt(1000);

        System.out.println("Randomly Generated Integers values: ");
        System.out.println(x);
        System.out.println(y);

        double a = random.nextDouble();
        double b = random.nextDouble();

        System.out.println("Randomly Generated Double Values");
        System.out.println(a);
        System.out.println(b);

        float f = random.nextFloat();
        float i = random.nextFloat();

        System.out.println("Randomly Generated Float Values");
        System.out.println(f);
        System.out.println(i);

        long p = random.nextLong();
        long q = random.nextLong();

        System.out.println("Randomly Generated Long values");
        System.out.println(p);
        System.out.println(q);

        boolean m = random.nextBoolean();
        boolean n = random.nextBoolean();

        System.out.println(m);
        System.out.println(n);        
    }
}
