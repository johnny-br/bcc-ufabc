import java.util.Scanner;


public class Basquete {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
	int d = scan.nextInt();
	int pontos = 0;	

	if(d <= 800){ 
	pontos = 1;
	}else if(d > 800 && d <=1400){
	pontos = 2;
	}else{
	pontos = 3;
	}
	

	System.out.println(pontos);
    }
}


