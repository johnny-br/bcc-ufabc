import java.util.Scanner;

public class Idade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int anoAtual = sc.nextInt();
        String nome = sc.next();
        int anoNasc = sc.nextInt();
        int completa = anoAtual - anoNasc;
        System.out.println(nome + ", voce completa " + completa + " anos de idade neste ano.");
    }
}

