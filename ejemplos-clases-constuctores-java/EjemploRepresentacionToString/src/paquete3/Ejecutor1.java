/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;


public class Ejecutor1 {
    public static void main(String[] args) {
        
        FacturaTelefonica fac = new FacturaTelefonica();
        fac.calcularValorFactura(); 
        
        System.out.printf("%s\n", fac);
        fac.establecerNumeroTelefono("948787237843")
    }
}
