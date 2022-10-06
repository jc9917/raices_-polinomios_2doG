package Area;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		System.out.println("\n*******************  AREA DE TRIANGULO ********************");
		
		
		Scanner entrada= new Scanner (System.in);
		 String a1 ="";
		 String b1="";
		 String c1="";
		 
		 cArea oArea = new cArea(a1,b1,c1);
		 oArea.LeerLados();
		 oArea.ComprobacionTriangulo();
		 oArea.TipoDeTriangulo();
		 oArea.CalculoA();
	}

}
