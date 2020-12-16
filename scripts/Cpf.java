import java.util.Scanner;
import java.lang.Character;

public class Cpf {
    public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
	String entrada;	

	while(scan.hasNext()){
	
		entrada = scan.next();
	    String p1, p2, p3, verif;

		int soma, primeiroDigito, segundoDigito;
		
		p1 = entrada.substring(0,3);
		p2 = entrada.substring(4,7);
		p3 = entrada.substring(8,11);
		verif = entrada.substring(12,14);

		//System.out.println(p1 + " " + " " +p2 +" " + p3 + " " + verif);
		soma = Character.getNumericValue(p1.charAt(0))*10;
		soma += Character.getNumericValue(p1.charAt(1))*9;
		soma += Character.getNumericValue(p1.charAt(2))*8;
	
		soma += Character.getNumericValue(p2.charAt(0))*7;
		soma += Character.getNumericValue(p2.charAt(1))*6;
		soma += Character.getNumericValue(p2.charAt(2))*5;
	
		soma += Character.getNumericValue(p3.charAt(0))*4;
		soma += Character.getNumericValue(p3.charAt(1))*3;
		soma += Character.getNumericValue(p3.charAt(2))*2;	
	
		soma *= 10;
		primeiroDigito = soma % 11;

		if(primeiroDigito == 10)
			primeiroDigito = 0;
	
		soma = Character.getNumericValue(p1.charAt(0))*11;
		soma += Character.getNumericValue(p1.charAt(1))*10;
		soma += Character.getNumericValue(p1.charAt(2))*9;
	
		soma += Character.getNumericValue(p2.charAt(0))*8;
		soma += Character.getNumericValue(p2.charAt(1))*7;
		soma += Character.getNumericValue(p2.charAt(2))*6;
	
		soma += Character.getNumericValue(p3.charAt(0))*5;
		soma += Character.getNumericValue(p3.charAt(1))*4;
		soma += Character.getNumericValue(p3.charAt(2))*3;
	
		soma += Character.getNumericValue(verif.charAt(0))*2;
		
			
		soma *= 10;
		segundoDigito = soma % 11;
		
		if(segundoDigito == 10)
			segundoDigito = 0;
			

		if(Character.getNumericValue(verif.charAt(0)) == primeiroDigito && Character.getNumericValue(verif.charAt(1)) == segundoDigito){
		System.out.println("CPF valido");
		}else{
		System.out.println("CPF invalido");
		}

	}
	

}
}


