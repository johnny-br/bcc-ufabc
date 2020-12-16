import java.util.Scanner;
import java.lang.Math; 

public class Eq2eCLUI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double delta = b*b-(4*a*c);
        double raizSoma = (-b + Math.sqrt(delta))/(2*a);
        double raizSubt = (-b - Math.sqrt(delta))/(2*a);
        System.out.println(raizSoma + " " + raizSubt);
    }
}

