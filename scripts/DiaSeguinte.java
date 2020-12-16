import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DiaSeguinte {
	public static void main(String args []){
	Scanner scan =  new Scanner(System.in);
	int d = scan.nextInt();
	int m = scan.nextInt();
	int a = scan.nextInt();
	
	//31 dias = 1, 3, 5, 7, 8, 10, 12
	//30 dias = 4, 6, 9, 11
	//28-29 = 2
	 
	/*if((m == 1)||(m == 3)||(m == 5)||(m == 7)||(m == 8)||(m == 10)||(m == 12)){
		if(d <=30){
		d = d + 1;
		System.out.println(d+" "+m+" "+a);
		}else if(d == 31){
			if (m == 12){
			d = 1;
			m = 1;
			a = a + 1;
			System.out.println(d+" "+m+" "+a);
			}else{
			d = 1;
			m = m +1;
			System.out.println(d+" "+m+" "+a);
			}
		}
		
	}else if((m == 4)||(m == 6)||(m == 9)||(m == 11)){
		if(d <= 29){
			d = d + 1;
			System.out.println(d+" "+m+" "+a);
		}else if (d == 30){
			d = 1;
			m = m + 1;
			System.out.println(d+" "+m+" "+a);
		}
	
	}else if(m == 2){
		if(d <= 27){
			d = d + 1;
			System.out.println(d+" "+m+" "+a);
		}else if ((d == 28) && !((a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0))){
			d = 1;
			m = m + 1;
			System.out.println(d+" "+m+" "+a);
		}else{
			d = d + 1;
			System.out.println(d+" "+m+" "+a);
		}
		//if((a % 400 == 0) || (a % 4 == 0) && (a % 100 != 0))
	
	
	}
	*/
	
	GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
	cal.set(a, m-1, d, 0, 0, 0);  

	cal.add((GregorianCalendar.DAY_OF_WEEK), 1);
	
	SimpleDateFormat ft = new SimpleDateFormat ("d M y");
	System.out.println(ft.format(cal.getTime()));

}
}
