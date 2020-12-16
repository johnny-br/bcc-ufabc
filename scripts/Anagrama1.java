import java.util.Scanner;
import java.util.ArrayList;

public class Anagrama1{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	ArrayList<String> palavras = new ArrayList<String>();
	boolean existeAnagrama = false;
	
	String palavra1 = scan.next();
	int n = scan.nextInt();
	
	for(int cont = 0; cont < n; cont++){	
		palavras.add(scan.next());
	}
	
	for(int cont = 0; cont < palavras.size(); cont++){
		
		int tamanho = palavras.get(cont).length()-1;
		int contagem = 0;
		
		if(palavra1.length() == tamanho+1){
			for(int cont2 = 0; tamanho != -1; cont2++){
				if(palavras.get(cont).charAt(cont2) == palavra1.charAt(tamanho)){
				contagem++;
				}
				tamanho--;
			
			}
		}
		
		if(contagem == palavras.get(cont).length()){
		existeAnagrama = true;
		break;
		}
		
		//System.out.println("Exist anagrama: " + existeAnagrama + "contagem " + contagem + "tamanho palavras " + palavras.get(cont).length());
	
	}
	
	if(existeAnagrama){
		System.out.println("sim");
	}else{
		System.out.println("nao");
	}
	
	
	}

}
