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
public class FibonacciDFCV {
    
    public int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int calcular (int numero) {
        if (numero > 1) {
            return calcular(numero - 1) + calcular(numero - 2);
        } else if (numero == 0 || numero == 1) {
            return numero;
	} else {
            return -1;
	} 
    }
}
