import java.util.Scanner;
import java.lang.Math; 

public class Eq2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        float delta = b*b-(4*a*c);
        float raizSoma = (-b + (float) Math.sqrt(delta))/(2*a);
        float raizSubt = (-b - (float) Math.sqrt(delta))/(2*a);
        System.out.println(String.format("%.4f", raizSoma) + " " + String.format("%.4f", raizSubt));
    }
}

