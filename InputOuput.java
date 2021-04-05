import java.util.Scanner;

public class InputOuput{
	public static void main(String[]args){
	  String nama;
	  int usia;
	  double ipk;
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Input nama : ");
	nama = scanner.nextLine();

	System.out.println("Input usia : ");
	usia = scanner.nextInt();

	System.out.println("Input ipk : ");
	ipk = scanner.nextDouble();

	System.out.println("Hai "+ nama);
	System.out.println("usia :"+ usia);
	System.out.println("ipk :"+ ipk);
}
}
