//Right triangle star pattern
public class Simple{
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//Left triangle star pattern
public class Simple{
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            for(int j=0; j<(10-i-1)*2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Pyramid Star Pattern
public class Simple{
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            for(int j=0; j<(10-i); j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Diamond shape pattern
import java.util.Scanner;
public class Simple{
    public static void main(String[] args){
        int row;
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=i+1; j<=row; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//downward triangle star pattern
import java.util.Scanner;
public class Simple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=i+1; j<=row; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(i+1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
    
//Mirrored Right Triangle Star Pattern
import java.util.Scanner;
public class Simple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=(row-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Reverse Pyramid Star Pattern
import java.util.Scanner;
public class Simple{
    public static void main(String[] args){
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=row-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
