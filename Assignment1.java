
public class Assignment1 {
	public static void main (String[] args){
		int O=0,O2=O,D=1,T=2,G=2,carryOver, test;
		
		for(;(O != O2 || O == D || O == T || O == G || D == T || D == G || T == G) && O < 10; O ++){
			carryOver = 0;
			T = G = 0;
			
			D = 4*O;
			if (D > 9){
				carryOver = D/10;
				D = D%10;
			}
			
			O2 = 4*O+carryOver;
			if (O2 > 9){
				carryOver = O2/10;
				O2 = O2%10;
			}
			test = carryOver;
			
			while (test != O && T < 10){
				T++;
				test = 4*T + carryOver;
				if (test > 10){
					test = test%10;
				}
				
			}
			
			test = 4*T + carryOver;
			if (test > 9){
				G = test/10;
				T = T%10;
				
			}
			else{
				G = 0;
			}
		System.out.printf("G = %d, O = %d, O2 = %d, D = %d, T = %d\n", G, O, O2, D, T);
		}
		
		System.out.printf("\nResults:\nG = %d\nT = %d\nO = %d\nD = %d\n", G, T, O, D);
	}
}
