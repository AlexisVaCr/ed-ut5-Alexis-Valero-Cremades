/*Diseña 2 funciones: la 1ª calculará y devolverá la superficie de una esfera; la 2ª calculará y
devolverá su volumen. Ambas funciones recibirán como parámetros el radio (tipo real). (RA4)
 */
import java.util.Scanner;
public class Ej2Te3 {

     static double supEsf(double r) {
       return 4*Math.PI*Math.pow(r,2);
    }

    static double volEsf(double r) {
        return 4*Math.PI/3*Math.pow(r,3);
    }

    public static void main(String[] args) {
         double r;
         Scanner sc = new Scanner(System.in);
         System.out.print("Radio ");
         r = sc.nextDouble();
         System.out.println("Superficie: " + supEsf(r));
         System.out.println("Volumen: " + volEsf(r));
    }
}