import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DiaAnterior {
	public static void main(String args []){
	Scanner scan =  new Scanner(System.in);
	int d = scan.nextInt();
	int m = scan.nextInt();
	int a = scan.nextInt();
	
	GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
	cal.set(a, m-1, d, 0, 0, 0);  

	cal.add((GregorianCalendar.DAY_OF_WEEK), -1);
	
	SimpleDateFormat ft = new SimpleDateFormat ("d M y");
	System.out.println(ft.format(cal.getTime()));
	
}
}
