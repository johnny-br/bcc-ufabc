import java.util.Scanner;


public class Cha {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
	int cha = scan.nextInt();
	int pontos = 0;

	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = scan.nextInt();
	int e = scan.nextInt();

	if(a == cha) 
	pontos++;
	if(b == cha)
	pontos++;
	if(c == cha)
	pontos++;
	if(d == cha)
	pontos++;
	if(e == cha)
	pontos++;

	System.out.println(pontos);
    }
}


