/*Diseña 2ºº funciones: la 1ª calculará y devolverá la superficie de una esfera; la 2ª calculará y
devolverá su volumen. Ambas funciones recibirán como parámetros el radio (tipo real). (RA4)
 */
import java.util.Scanner;
public class Ej2Te3 {

     static double supEsf(double r) {
       return 4*Math.PI*Math.pow(r,2);
    }

    static double volEsf(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3); // Se modifica la fórmula por Soraya Garcés
        //return 4*Math.PI/3*Math.pow(r,3);  de Alexis
    }

    public static void main(String[] args) {
         double r;
         Scanner sc = new Scanner(System.in);
         System.out.print("\nIntroduce el valor del Radio: "); //Se modifica la entrada de texto, por Soraya Garcés
        //System.out.print("Radio: "); de Alexis
         r = sc.nextDouble();
         System.out.println("Superficie: " + supEsf(r));
         System.out.println("Volumen: " + volEsf(r));
    }
}