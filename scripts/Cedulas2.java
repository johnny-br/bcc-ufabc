import java.util.Scanner;
import java.lang.Math; 

public class Cedulas2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
 		System.out.println("R$" + N +".00");
 		if(Math.abs(N/100)!=0){
 		System.out.println(Math.abs(N/100) + " nota(s) de R$100.00");
 		N = N - Math.abs(N/100)*100;
 		}
 		if(Math.abs(N/50) != 0){
 		System.out.println(Math.abs(N/50) + " nota(s) de R$50.00");
 		N = N - Math.abs(N/50)*50;
 		}
 		if(Math.abs(N/20) != 0){
 		System.out.println(Math.abs(N/20) + " nota(s) de R$20.00");
 		N = N - Math.abs(N/20)*20;
 		}
 		if(Math.abs(N/10) != 0){
 		System.out.println(Math.abs(N/10) + " nota(s) de R$10.00");
 		N = N - Math.abs(N/10)*10;
 		}
 		if(Math.abs(N/5) != 0){
 		System.out.println(Math.abs(N/5) + " nota(s) de R$5.00");
 		N = N - Math.abs(N/5)*5;
 		}
 		if(Math.abs(N/2) != 0){
 		System.out.println(Math.abs(N/2) + " nota(s) de R$2.00");
 		N = N - Math.abs(N/2)*2;
 		}if(Math.abs(N/1) != 0){
 		System.out.println(Math.abs(N/1) + " nota(s) de R$1.00");
        }
    }
}

