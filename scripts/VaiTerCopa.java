import java.util.Scanner;
import java.util.ArrayList;

public class VaiTerCopa {
    public static void main(String args[]) {
	
    /* Scanner scan = new Scanner(System.in);
    int a = 0, cont = 0, ignora;
	int n_linhas = 0;
	int valores[] = new int[45000];
	
	for (int i = 0; i < 45000; i++){
		valores[i] = 888;  
	}
	
	
    while(scan.hasNext()){
		valores[cont] = scan.nextInt();
		cont++;
	}
	
	for (int i = 0; valores[i] != 888; i++){
		if (valores[i] == 0){
		System.out.println("vai ter copa!");
		}else{
		System.out.println("vai ter duas!");
		}
	}*/
	
	 Scanner scan = new Scanner(System.in);
	 ArrayList<Integer> numeros = new ArrayList<Integer>();
	 
	 while(scan.hasNext()){
	 numeros.add(scan.nextInt());
	 }
	 
	 
	 for (int i = 0; i < numeros.size(); i++){
		if (numeros.get(i) == 0){
		System.out.println("vai ter copa!");
		}else{
		System.out.println("vai ter duas!");
		}
	}
	 
	 //System.out.println(numeros.size());
	 
}	
}
