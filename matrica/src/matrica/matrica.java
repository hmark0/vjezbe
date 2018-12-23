package matrica;

import javax.swing.JOptionPane;

public class matrica {
public static void main(String[] args){ 
                                                                                                                                                                                                                                                      	
	int red = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka"));
	int stup = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
	int [][] matrica = new int [red][stup];
	int a=1;
	int setacr = 0;
	int setacs = 0;
	while(a<(red*stup)){
		
	for(int i=1;i<red;i++){
		matrica [i][setacr] = a++; setacr++;
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
		matrica[setacr][setacs]= a++;setacr++;
		if(k<=red){
			break;
		}                                                                                                                                                                                                                                                                                                                                                                                                
	}
	for(int m=0;m<stup-1;m++){
		matrica[setacr][setacs] = a++; setacs++;
		if(m>=stup-1){
			break;
			}
	for(int n=0;n<red-1;n++){
		matrica[setacr][setacs]= a++;setacr++;
		if(n<=red-1){
			break;
		}
	}
		}
	
	for(int l = 0;l<stup-1;l++){
		matrica[setacr][setacs]= a++;setacs++;
		if(l>=stup){
			break;
		}
		for(int m=0;m<red-1;m++){
			matrica[setacr][setacs] = a++;setacr++;
			if(m>=red){
				break;
			}
		}
		
	}
	}

	for(int i=0;i<setacr;i++) {
		for(int j=0;j<setacs;j++) {
			System.out.print(matrica[i][j]+ "	");
			
		}
	System.out.println();
}
}
}