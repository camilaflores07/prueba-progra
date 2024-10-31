/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejercicio1;

import java.util.Scanner;

/**
 *
 * @author 50494
 */
public class PruebaEjercicio1 {

    
    public static void main(String[] args) {
        double CostoTotal, precio;
        int cantidadproductos, producto;
       
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("---SUPERMERCADO---");
        System.out.println("Porfavor ingrese el precio del producto que desea comprar: ");
        precio = entrada.nextDouble();
        System.out.println("Ingrese la cantidad del producto que desea comprar: ");
        producto = entrada.nextInt();
        
        System.out.println("Cuantos productos va a registrar? : ");
        cantidadproductos = entrada.nextInt();
        
        
        CostoTotal = (precio * cantidadproductos);
        System.out.println("El costo total de su compra es de: " +CostoTotal);
        
       
       
       
    }
    
}
