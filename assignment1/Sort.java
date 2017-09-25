package triangle;
import java.util.Scanner;


public class Sort {
	public static void main(String[] args) {
		int numbers[] = new int[15];
		System.out.println("Enter 15 integers:");
		for(int i=0; i< numbers.length; i++){
			Scanner line = new Scanner(System.in);
			numbers[i] = line.nextInt();
		}
		int i, j;
		for (i = 0; i < numbers.length; i++) {
	        for (j = i + 1; j < numbers.length; j++) {
	        	int sub = 0;
	        	if (numbers[i] < numbers[j]){
	        		sub = numbers[i];
	        		numbers[i] = numbers[j];
	        		numbers[j] = sub;
	        	}
	        }
		}
		System.out.print("Sorted array: ");
		for(int k=0; k< numbers.length; k++){
			System.out.print(numbers[k]+" ");
		}
	}
}
