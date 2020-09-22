/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesoadolar;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Pesoadolar {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double dolar = 850.0;
        double peso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor en peso");
        peso = sc.nextInt();
        System.out.println("el equivatente en dolares para el valor ingresado es de " +(peso/dolar));
        
    }
    
}
