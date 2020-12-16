import java.util.Scanner;
import java.lang.Character;
import java.lang.String;

public class Cpf2 {
    public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
	String entrada;	
	//Reescrito 10/08/19

	while(scan.hasNext()){
	
		entrada = scan.next();
	    String p1, p2, p3, verif, str_cpf;

		int soma = 0, primeiroDigito, segundoDigito;
		
		p1 = entrada.substring(0,3);
		p2 = entrada.substring(3,6);
		p3 = entrada.substring(6,9);
		
		str_cpf = p1 + p2 + p3;
		//System.out.println( p1 + " "+ p2 +" " + p3);
		
		int d = 8;
		for(int cont = 0; cont < str_cpf.length(); cont++){
			soma += Character.getNumericValue(str_cpf.charAt(d)) * (9 - (cont % 10));
			d--;
		}
		primeiroDigito = (soma % 11) % 10;

		d = 8;
		soma = 0;

		for(int cont = 0; cont < str_cpf.length(); cont++){
			soma += Character.getNumericValue(str_cpf.charAt(d)) * (9 - ((cont + 1) % 10));
			d--;
		}

		soma += primeiroDigito * 9;
		soma = (soma % 11) % 10;

		segundoDigito = soma;

		System.out.println(p1+"."+p2+"."+p3+"-"+ primeiroDigito + segundoDigito);

	}
	

}
}


