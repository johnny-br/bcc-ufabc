import java.util.Scanner;

public class Lua {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
 		int m2 = sc.nextInt();
 		if (m2 <= 2){System.out.println("Nova");}
 		else if (m1 < m2){System.out.println("Crescente");}
 		else if (m2 >= 96){System.out.println("Cheia");}
 		else{System.out.println("Minguante");}
    }
}

