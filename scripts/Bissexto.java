import java.util.Scanner;
import java.lang.Math; 

public class Bissexto {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
	if((A % 400 == 0) || (A % 4 == 0) && (A % 100 != 0)){
 	System.out.println("ANO BISSEXTO");	
        }else{
	System.out.println("ANO NAO BISSEXTO");
		}
    }
}


