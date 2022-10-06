import java.util.Scanner;

public class raiz {
   public static double leer() {
      Scanner ing = new Scanner(System.in);
      double nValor;
      do {
         nValor = ing.nextDouble();
      } while (!verificarDato(nValor) && nValor < -10000 && nValor > 10000);
      return nValor;
   }

   public static boolean verificarDato(double nValor) {
      String n = Double.toString(nValor);
      boolean verif = n.matches("-?\\d+(\\.\\d+)?");
      return verif;
   }

   public static double calculoDiscriminante(double a, double b, double c) {
      return Math.pow(b, 2.0) - 4 * a * c;
   }

   public static void mostrarResultado(double a, double b, double c) {
      double disc = calculoDiscriminante(a, b, c);
      if (disc > 0) {
         System.out.println("\nLa primera solución X1 es: " + ((-b + Math.sqrt(disc)) / 2 * a));
         System.out.println("La segunda solución X2 es: " + ((-b - Math.sqrt(disc)) / 2 * a));
      } else {
         if (disc == 0) {
            System.out.println("\nLa ecuación solo tiene una raíz X1 es: " + (-b / 2.0 * a));
         } else {
            double xr = (-b / (2.0 * a));
            double xi = Math.sqrt(-disc) / (2 * a);
            System.out.println("\nLa raiz real es:... " + (xr));
            System.out.println("La imaginaria es:... " + (xi));
         }
      }
   }

   public static void main(String[] args) {
      double a, b, c;
      try {
         do {
            System.out.println("Ingrese el valor de a");
            a = leer();
         } while (a == 0);
         System.out.println("Ingrese el valor de b");
         b = leer();
         System.out.println("Ingrese el valor de c");
         c = leer();
         mostrarResultado(a, b, c);
      } catch (Exception e) {
         System.out.println("Solo se permite números");
      }
   }
}
