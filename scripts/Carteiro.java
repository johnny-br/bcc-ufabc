import java.util.Scanner;
import java.lang.Math;

public class Carteiro {

	public int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            if (arr[m] == x) 
                return m; 
  
            if (arr[m] < x) 
                l = m + 1; 
  
            else
                r = m - 1; 
        } 

        return -1; 
    } 


 
    public static void main(String[] args){
 	Scanner scan = new Scanner(System.in);
	
	int contador = 0;
	int n = scan.nextInt();
	int m = scan.nextInt();
	int n_casas[] = new int[n];
	int n_encom[] = new int[m];
	int tempo = 0;
	int pAtual = 0;
	
	while (contador < n){
	n_casas[contador] = scan.nextInt();
	contador = contador + 1;
	}
	contador = 0;
	
	while (contador < n){
	n_encom[contador] = scan.nextInt();
	contador = contador + 1;
	}
    
    
    int cont_encom = 0;
    int index = 0;
    
    Carteiro ob = new Carteiro();
    
    
    while(cont_encom < n_encom.length){
    index = ob.binarySearch(n_casas,n_encom[cont_encom]); 
    //System.out.println("Encomenda: " + n_encom[cont_encom] + " Posicao: " + index);
    tempo = tempo + Math.abs(index - pAtual);
    pAtual = index;
    cont_encom++;
	}
	
	System.out.println(tempo);
 
 
 
    }
 
}
