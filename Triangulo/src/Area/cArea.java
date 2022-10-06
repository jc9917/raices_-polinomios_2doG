package Area;

import java.util.Scanner;

/**
*
* @author Jemmy Puzma 6627
* @author Alex Aucancela 6675
* @author David Llumitaxi 6700
* @author Juan Carrera 6605
*/

public class cArea {
	String a1,b1,c1;
    
    cArea (String a1, String b1, String c1){
        this.a1=a1;
        this.b1=b1;
        this.c1=c1;
    }
    public void LeerLados(){
        
    	int a,b,c;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el lado a");
        try {
        	do {
        		a1 = entrada.next();
				a = Integer.parseInt(a1);
			    } while(a <= 0 || a >= 20);
        }catch (Exception e){
        	System.out.println("Debe ingresar obligatoriamente un numero entero.");
        	do {
        		a1 = entrada.next();
				a = Integer.parseInt(a1);
			    } while(a <= 0 || a >= 20);
        }
			 
			
		System.out.println("Ingrese el lado b"); 
		try {
        	do {
        		b1 = entrada.next();
				b = Integer.parseInt(b1);
			    } while(b <= 0 || b >= 20);
        }catch (Exception e){
        	System.out.println("Debe ingresar obligatoriamente un numero entero.");
        	do {
        		b1 = entrada.next();
				b = Integer.parseInt(b1);
			    } while(b <= 0 || b >= 20);
        }
		
		System.out.println("Ingrese el lado c");
		try {
        	do {
        		c1 = entrada.next();
				c = Integer.parseInt(c1);
			    } while(c <= 0 || c >= 20);
        }catch (Exception e){
        	System.out.println("Debe ingresar obligatoriamente un numero entero.");
        	do {
        		c1 = entrada.next();
				c = Integer.parseInt(c1);
			    } while(c <= 0 || c >= 20);
        }
    }
    
    
    public void ComprobacionTriangulo() {
    	
    	int a,b,c;
    	
		a = Integer.parseInt(a1);
		b = Integer.parseInt(b1);
		c = Integer.parseInt(c1);
		
    	System.out.println("\n\n*****    Comprobacion de que sea un triangulo   *****");
    	if ((a+b>c)&(c+b>a)&(a+c>b))
    		{
    		System.out.print("Existe triangulo\n\n");
    		}
    	else
    	{
    		System.out.print("No existe triangulo\n\n");
    		LeerLados();
    	}
}
    	
    	public void TipoDeTriangulo() {
    		
    		int a,b,c;
        	
    		a = Integer.parseInt(a1);
    		b = Integer.parseInt(b1);
    		c = Integer.parseInt(c1);
    		
    		System.out.println("\n\n*****    Tipo de triangulo    *****");
        	
        	if ((a==b) && (b==c))
			{
			System.out.println("Triangulo Equilatero");
			
			}	else	{
					if(((a == b) && a != c ) || ((a==c) && a != b) || ((b==c) && a != b)  )
						{
							System.out.println("Triangulo Isoseles");
						}	else	{
								System.out.println("Triangulo Escaleno");
								}
					}
    }
    	
    	public double CalculoA() {
    		
    		
        	double area;
        	double s;
        	
        	int a,b,c;
        	
    		a = Integer.parseInt(a1);
    		b = Integer.parseInt(b1);
    		c = Integer.parseInt(c1);
    		
        	System.out.println("\n\n*****    Area   *****");
        	
        	if ((a==b) && (b==c))
			{
        		area= ((Math.sqrt(3)/4)* Math.pow(a, 2));
        		System.out.println(Math.round(area*100.0)/100.0);
        		return area;
			
			}	else	{
					if(((a == b) && a != c ) || ((a==c) && a != b) || ((b==c) && a != b)  )
						{
							area= ((b * (Math.sqrt(Math.pow(a, 2)- Math.pow(b, 2)/4)))/2);
							System.out.println(Math.round(area*100.0)/100.0);
							return area;
						}	else	{
								s= (a+b+c)/2;
								area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
								System.out.println(Math.round(area*100.0)/100.0);
								return area;
								}
					}
    }
}
