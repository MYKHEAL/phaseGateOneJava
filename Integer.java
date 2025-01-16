import java.util.Scanner;
public class Integer{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
while (true) {
System.out.println("Enter a number:");
int prime = input.nextInt();
input.nextLine();

	if (prime % 2 != 0 ){
	System.out.println("true");
			break;
	}else{
		System.out.println("false");
			break;
	}
}
}


}