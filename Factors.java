import java.util.Scanner;

public class Factors{

public static void main(String[] args) {


Scanner input = new Scanner(System.in);


	System.out.print("enter a number: ");
	int result = input.nextInt();
	
	
	int count = result;
	
	
	System.out.print("the factors of is");
	
	while (count > 0) {
		
		if (result % count == 0) {
			System.out.print(count);
		}
	count--;
}


}
}