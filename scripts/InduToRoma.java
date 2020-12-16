import java.util.Scanner;

public class InduToRoma{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);	
		String resposta = new String();    
	
		while(scan.hasNext()){
		
		int a = scan.nextInt();
		
		if(a/1000 > 0){
				if(a/1000 == 1){
					resposta += "M";
				}else if(a/1000 == 2){
					resposta += "MM";
				}else if (a/1000 == 3){
					resposta += "MMM";
				}
			}
			
		a = (a-(a/1000)*1000);
		
		if(a / 100 > 0){
			if(a/100 == 1){
					resposta += "C";
				}else if(a/100 == 2){
					resposta += "CC";
				}else if (a/100 == 3){
					resposta += "CCC";
				}else if (a/100 == 4){
					resposta += "CD";
				}else if (a/100 == 5){
					resposta += "D";
				}else if (a/100 == 6){
					resposta += "DC";
				}else if (a/100 == 7){
					resposta += "DCC";
				}else if (a/100 == 8){
					resposta += "DCCC";
				}else if (a/100 == 9){
					resposta += "CM";
				}
		}	
		
		a = (a-(a/100)*100);

		if(a / 10 > 0){
			if(a/10 == 1){
					resposta += "X";
				}else if(a/10 == 2){
					resposta += "XX";
				}else if (a/10 == 3){
					resposta += "XXX";
				}else if (a/10 == 4){
					resposta += "XL";
				}else if (a/10 == 5){
					resposta += "L";
				}else if (a/10 == 6){
					resposta += "LX";
				}else if (a/10 == 7){
					resposta += "LXX";
				}else if (a/10 == 8){
					resposta += "LXXX";
				}else if (a/10 == 9){
					resposta += "XC";
				}
		}	
		
		a = (a-(a/10)*10);
		
		if(a == 1){
				resposta += "I";
			}else if(a == 2){
				resposta += "II";
			}else if (a == 3){
				resposta += "III";
			}else if (a == 4){
				resposta += "IV";
			}else if (a == 5){
				resposta += "V";
			}else if (a == 6){
				resposta += "VI";
			}else if (a == 7){
				resposta += "VII";
			}else if (a == 8){
				resposta += "VIII";
			}else if (a == 9){
				resposta += "IX";
			}
		
		System.out.println(resposta);
		resposta = "";
		
		}
	
	
	}
}
