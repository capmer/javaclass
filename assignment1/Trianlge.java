package triangle;
import java.util.Scanner;

public class Trianlge {
	public static void main(String[] args) {
		Scanner line = new Scanner(System.in);
		int i, j, n;
		System.out.print("Enter n: ");
		n = line.nextInt();
		
		for(i=1; i<=n; i++){
			for(j=1; j<=i; j++){
			System.out.print("* * ");
		}
			System.out.println("");
	}
		for(int k=0; k<=(n*2); k++){
			System.out.print("* ");
		}
		System.out.println("");
		for(i=n; i>=1; i--){
			for(j=1; j<=i; ++j){
				System.out.print("* * ");
			}
			System.out.println("");
		}
}
}
