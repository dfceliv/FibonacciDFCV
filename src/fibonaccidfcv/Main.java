/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonaccidfcv;

/**
 *
 * @author Fernando
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 10;
        FibonacciDFCV f = new FibonacciDFCV();
        f.setNumero(numero);
        System.out.println("La secuencia de fibonacci para el número " + numero + " es: " + f.calcular(numero));
    }
    
}
