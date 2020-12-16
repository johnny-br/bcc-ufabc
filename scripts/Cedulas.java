import java.util.Scanner;
import java.lang.Math; 

public class Cedulas {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
 		System.out.println("R$" + N +".00");
 		System.out.println(Math.abs(N/100) + " nota(s) de R$100.00");
 		N = N - Math.abs(N/100)*100;
 		System.out.println(Math.abs(N/50) + " nota(s) de R$50.00");
 		N = N - Math.abs(N/50)*50;
 		System.out.println(Math.abs(N/20) + " nota(s) de R$20.00");
 		N = N - Math.abs(N/20)*20;
 		System.out.println(Math.abs(N/10) + " nota(s) de R$10.00");
 		N = N - Math.abs(N/10)*10;
 		System.out.println(Math.abs(N/5) + " nota(s) de R$5.00");
 		N = N - Math.abs(N/5)*5;
 		System.out.println(Math.abs(N/2) + " nota(s) de R$2.00");
 		N = N - Math.abs(N/2)*2;
 		System.out.println(Math.abs(N/1) + " nota(s) de R$1.00");
        
    }
}

