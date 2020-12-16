import java.util.Scanner;
import java.util.ArrayList;

public class Palindromo{
	public static void  main (String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> palavras = new ArrayList<String>(); 
	
		while(scan.hasNext()){
			palavras.add(scan.next());
		}
	
		for(int cont = 0; cont < palavras.size(); cont++){
			int tamanho = palavras.get(cont).length()-1;
			int contagem = 0;
			
			for(int cont2 = 0; tamanho != -1 ; cont2++){
				if(palavras.get(cont).charAt(cont2) == palavras.get(cont).charAt(tamanho)){
					//System.out.println("cont2 " + cont2);
					
					contagem++;
				}
				tamanho--;
			
			}
			
			if(contagem == palavras.get(cont).length()){
				System.out.println("sim");
			//System.out.println(palavras.get(cont));
			    
			}else{
				System.out.println("nao");
								
			}

		}
		
		
	
	} 

}
