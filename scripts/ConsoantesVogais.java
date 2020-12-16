import java.util.Scanner;

public class ConsoantesVogais {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	char C = sc.next().charAt(0);
	if((C == 'a' || C == 'A') || (C == 'e' || C == 'E') || (C == 'i' || C == 'I') || (C == 'o' || C == 'O')|| (C == 'U' || C == 'u') ){
	System.out.println("vogal");
	}else{
	System.out.println("consoante");
	}
	}
    }



