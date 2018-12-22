package matrica;

import javax.swing.JOptionPane;

public class matrica {
public static void main(String[] args){ 
                                                                                                                                                                                                                                                      	
	int red = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka"));
	int stup = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
	int [][] matrica = new int [red][stup];
	int a=1;
	int maxs = 0;
	int setacr = 1;
	int setacs = 0;
	while(a<(red*stup)){
		
	for(int i=1;i<red;i++){
		matrica [i][setacs] = a++; setacr++;
	if(i>=red){
		break;
	}
	}
	for(int j=0;j<stup;j++){
		matrica[red][setacs] =  a++; setacs++;
		if(j>=stup){
			break;
		}
	}
	for(int k=0;k>red;k++){
		matrica[setacr][stup]= a++;setacr++;
		if(k<=red){
			break;
		}                                                                                                                                                                                                                                                                                                                                                                                                
	}
	for(int l = setacs;l<stup-1;l++){
		matrica[red][setacs]= a++;setacs++;
		if(l>=stup){
			break;
		}
		for(int m=0;m<red-1;m++){
			matrica[setacr][stup] = a++;setacr++;
			if(m>=red){
				break;
			}
		}
		
	}
}
	for(int i=0;i<red;i++) {
		for(int j=0;j<stup;j++) {
			System.out.print(matrica[i][j]+ "	");
			
		}
	System.out.println();
}
}
}