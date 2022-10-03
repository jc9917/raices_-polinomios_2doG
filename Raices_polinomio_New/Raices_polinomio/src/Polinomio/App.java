package Polinomio;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n*******************  RAICES DE UN PILONOMIO ********************");
		
		
		Scanner entrada= new Scanner (System.in);
		 int a =0;
		 int b=0;
		 int c=0;
		 
		 cRaices oRaices = new cRaices(a,b,c);
		 oRaices.LeerDatos();
	}

}
