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
	while(a<(red*stup)){
		for(int i=1;i<red;i++){
			matrica[i][setacs] = a++; setacr++;
			if(i<=red){
				break;
			}
		}
		for(int i=setacr;i<stup+setacr;i++){
		
			matrica[setacr][i] = a++;setacs++;
			if(i>=stup+setacr){
				break;
			}
		}
		for(int i=setacr;i<(red - 1)+ setacr;i++){
			matrica[i][setacs] = a++;setacr++;
			if(i>=red+setacs){
				break;
			}
		}
	}
	for(int i = 0;i<setacr;i++){
		for(int j =0;j<setacs;j++){
			System.out.println(matrica[i][j] + " ");
		}
	}
}
}
