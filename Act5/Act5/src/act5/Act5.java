//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario 
//hasta que la suma de los números introducidos supere el límite inicial.
package act5;
import java.util.Scanner;
public class Act5 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un limite");
        int limite = leer.nextInt();
        int suma = 0;
        do{
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("La suma final fue de: " + suma);
        } while (suma < limite);
    } 
}
