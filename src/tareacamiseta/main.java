/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacamiseta;

import java.util.Scanner;

/**
 *
 * @author leyle
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    double totalPrecio = 0;   
        
    Camiseta camiUno = new Camiseta(1);
    Camiseta camiDos = new Camiseta(2);    
    Camiseta camiTres = new Camiseta(3);        
        
    Scanner numeroCamisetaUno = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Entrar cantidad de camisa manga corta");
    int cantidad1 = numeroCamisetaUno.nextInt();  // Read user input    
    
    totalPrecio = camiUno.calculCamiseta(cantidad1);
    
    Scanner numeroCamisetaDos = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Entrar cantidad de camisa casula manga larga");
    int cantidad2 = numeroCamisetaDos.nextInt();  // Read user input 
        
    totalPrecio += camiDos.calculCamiseta(cantidad2);
    
    Scanner numeroCamisetaTres = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Entrar cantidad de camisa Formal manga larga");
    int cantidad3 = numeroCamisetaTres.nextInt();  // Read user input 
        
    totalPrecio += camiTres.calculCamiseta(cantidad3);
    
    System.out.println("El costo total es de " +totalPrecio);
        
    }
    
}
