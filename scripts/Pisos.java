import java.util.Scanner;


public class Pisos {
    public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
	int l = scan.nextInt();
	int c = scan.nextInt();

	int largura = l*c+(l-1)*(c-1);
	int comprimento = (c-1)*2 +(l-1)*2;
	
	System.out.println(largura);
	System.out.println(comprimento);
	
    }
}


