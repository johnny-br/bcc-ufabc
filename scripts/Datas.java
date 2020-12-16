import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Datas {
    public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int qt_testes = sc.nextInt();
	
	ArrayList<Integer> valores = new ArrayList<Integer>();
	
	for(int i = 0; i < qt_testes; i++){
	
		int D = sc.nextInt();
		int M = sc.nextInt();
		int A = sc.nextInt();
	   
	   
		GregorianCalendar Date = new GregorianCalendar();  
		Date.setLenient(false);  
		Date.set(A, M-1, D, 0, 0, 0);  
		try{  
		    Date.getTime();  
		    //System.out.println("DATA VALIDA");
		    valores.add(1);  
		    }catch (Exception e){  
		        //System.out.println("DATA INVALIDA");   
		    valores.add(0);       
		    }  
	}
	
	for (int i = 0; i < valores.size(); i++){
		if (valores.get(i) == 1){
		System.out.println("DATA VALIDA");
		}else{
		System.out.println("DATA INVALIDA");  
		}
	}  
	  
	  
}}
