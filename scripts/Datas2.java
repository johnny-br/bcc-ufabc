import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
public class Datas2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int M = sc.nextInt();
        int A = sc.nextInt();
    
	if(D<=31 && M <= 12){  
	
		if((A % 400 == 0) || (A % 4 == 0) && (A % 100 != 0)){
			if((M == 2 && D<=29) || (M == 4 && D<=30) || (M == 6 && D <= 30) || (M == 9 && D <= 30) || (M == 11 && D <= 30)){
 			System.out.println("DATA VALIDA");	
 									}
 			else if((M == 1 && D<=31) || (M == 3 && D <= 31) || (M == 4 && D <= 31) || (M == 5 && D <= 31) || (M == 7 && D <= 31) || (M == 8 && D <= 31) || (M == 10 && D <= 31) || (M == 12 && D <= 31)){
 			System.out.println("DATA VALIDA");
 			}else{
 			System.out.println("DATA INVALIDA");
 			}							
 		
         }else if ((M == 4 && D<=30) || (M == 6 && D <= 30) || (M == 9 && D <= 30) || (M == 11 && D <= 30)){
         	System.out.println("DATA VALIDA");
         }else if ((M == 1 && D<=31) || (M == 3 && D <= 31) || (M == 4 && D <= 31) || (M == 5 && D <= 31) || (M == 7 && D <= 31) || (M == 8 && D <= 31) || (M == 10 && D <= 31) || (M == 12 && D <= 31)){
         System.out.println("DATA VALIDA");
         }else{
         System.out.println("DATA INVALIDA");
         }
        												
        
        				
        				}
        else{
	  System.out.println("DATA INVALIDA");
		}
		
    }
}

*/
public class Datas2 {
    public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int M = sc.nextInt();
    int A = sc.nextInt();
   
	GregorianCalendar Date = new GregorianCalendar();  
    Date.setLenient(false);  
    Date.set(A, M-1, D, 0, 0, 0);  
    try{  
        Date.getTime();  
        System.out.println("DATA VALIDA");  
        }catch (Exception e){  
            System.out.println("DATA INVALIDA");   
             
        }  
	
	
	  
}}
