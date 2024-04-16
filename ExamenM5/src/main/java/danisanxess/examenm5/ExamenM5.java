
package danisanxess.examenm5;

import static exercici1.Metodes.canviarMoneda;
import static exercici1.Metodes.imprimir;
import static exercici1.Metodes.introduirEuros;
import static exercici1.Metodes.introduirMoneda;
import static exercici2.Metodes.existeixNom;
import static exercici2.Metodes.introduirLlistaGrup;
import static exercici2.Metodes.introduirNomBuscat;
import static exercici2.Metodes.posicioArray;
import java.util.Scanner;

/**
 *
 * @author Daniel Sánchez
 */
public class ExamenM5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println(5*0.839);
        System.out.println(5*1.138);
        System.out.println(5*131.615);
        
        
        double euros = introduirEuros();
        String moneda = introduirMoneda();
        double canvi = canviarMoneda(moneda, euros);
        System.out.printf("\033[35m %.2f € són %.2f %s \n" , euros, canvi, moneda);

        imprimir(canvi);
        
        /*
        *  Programa que carrega els noms dels alumnes d'un grup i busca la posició d'un ells.
        *  El grup no té alumnes amb noms repetits
         */
        Scanner entrada = new Scanner(System.in);
        String[] grupA;
        int i = 0, n;
        boolean trobat;

        System.out.print("\n...............INSTITUT LA FERRERIA............ \n ");
        System.out.print("\n...............DAM GRUP 1 A2 .................. \n ");
        System.out.print("\n Introdueix el nombre d'alumnes del grup :  ");

        while (!entrada.hasNextInt()) {
            System.out.print("\n" + "\u001B[35m Introdueix el nombre d'alumnes del grup ( valor numeric ) :  ");
            entrada.nextLine();
           
        }
        n = entrada.nextInt();
        grupA = new String[n];

        introduirLlistaGrup(grupA);

        String nomBuscat = introduirNomBuscat();

        trobat = existeixNom(grupA, nomBuscat);

        if (!trobat) {
            System.out.println("\n \u001B[35m" + nomBuscat + " no existeix en el grup \n\n\n");
        } else {
            System.out.println("\n  \u001B[35m" + nomBuscat + " existeix al grup a la posició " + (posicioArray(grupA, nomBuscat) + 1)+ "\n\n\n");
        }
        
    }
    
}
