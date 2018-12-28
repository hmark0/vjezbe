package matrica;

import javax.swing.JOptionPane;

public class matrica_cisce {
public static void main(String[] args) {
	int red = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka"));
	int stup = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
	int [][] matrica = new int [red][stup];
	int a=1;
	int setacr = 0;
	int setacs = 0;
	int max = red-1;
	int min = stup-1;
	while(a<=(red*stup)){
		for(int i=1;i<red;i++){
			matrica[i][setacs] = a++;
			if(i>=red){
				break;
			}
		}
		for(int i=setacs;i<stup;i++){
		
			matrica[setacr][i] = a++;
			if(i>=stup){
				break;
			}
		}
		for(int i=setacr;i<max ;i++){
			matrica[i][setacs] = a++;
			if(i>=max){
				break;
			}
			for(int j =setacs;j<min;j++){
				matrica[setacr][j] = a++;
			}
		}
		setacr++;
		setacs++;
		max--;
		min--;
	}
	for(int i = 0;i<red;i++){
		for(int j =0;j<stup;j++){
			System.out.println(matrica[i][j] + " ");
		}
	}
	
}
}
