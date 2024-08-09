import java.util.Scanner;

/**
 *
 * @author sazo
 */
/**
 * Permite calcular la conversion de quetzales a dolares
 */
public class Quetzal_Dolar {
    
       public static void main(String[] args) {
        /**
         * Se Definen las variables Quetzales, Dolares y Total como Reales
         */
        double Quetzales, Dolares, Total;
        Scanner scanner = new Scanner(System.in);
        /**
         * se le solicita al usuario que coloque la cantidad de Quetzales
         */
        System.out.println("Coloque la cantidad de Quetzales:");
        Quetzales = scanner.nextDouble();
        /**
         * Se le solicita al usuario que coloque el precio en que esta el dolar en ese momento
         */
        System.out.println("Coloque el precio del Dólar:");
        Dolares = scanner.nextDouble();
        /**
         * se hace la operacion para convertir los quetzales a dolares
         */
        Total = Quetzales / Dolares;
        /**
         * se muestra la cantidad de dolares equivalente a la cantidad de quetzales que anteriormente se ingresaron
         */
        System.out.println("La cantidad de dólares es: " + Total);
    }
}
