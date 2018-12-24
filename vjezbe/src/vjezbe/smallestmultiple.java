package vjezbe;


public class smallestmultiple {
public static void main(String[] args) {
//	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	int broj=0;
	int n=1;
	int [] polje = new int [i];
	for(int i=1;i<=20;i++){
	polje[i] = i++;
	if(n%2!=0 && n%polje [i] !=0 ){
				n ++;
	}if(n%2==0 && n%polje[i]==0){
		break;
	}	
	}
	System.out.println(n);
	}
	}


