//Simple.java

//without using recursion.

public class Simple{
    public static void main(String[] args){
        int a=0, b=1, c, count = 10;
        System.out.print(a+" "+b);

        for(int i=2; i<count; i++){
            c=a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}

//using recursion.

public class Simple{
   
        static int a=0, b=1, c;

        static void printFibonacci(int count){
            if(count>0){
               c = a + b;
               a = b;
               b = c;
               System.out.print(" "+c);
               printFibonacci(count-1);
            }
        }
        public static void main(String[] args){
            int count = 10;
            System.out.print(a+" "+b);
            printFibonacci(count-2);
        }
    
}
