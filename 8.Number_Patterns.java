//1.pattern1
package pac1;

public class Main{
	public static void main(String[] args) {
		int number,n=7;
		for(int i=0; i<n; i++) {
			number=1;
			for(int j=0; j<=i; j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}

//2.Pattern2
package pac1;

public class Main{
	public static void main(String[] args) {
		int x = 0;
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(++x + " ");
			}
			System.out.println();
		}
	}
}
