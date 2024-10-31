/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejercicio2;

import java.util.Scanner;

/**
 *
 * @author 50494
 */
public class PruebaEjercicio2 {

   
    public static void main(String[] args) {
        double agua, TotalAnual, promedioAnual;
        String enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;
        
        System.out.println("---Contador de Agua---");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Porfavor ingrese el consumo mensual de agua que ha consumido durante los siguientes meses. ");
        
        System.out.println("En Enero usted consumio: ");
        enero = entrada.nextLine();
        
        System.out.println("En Febrero usted consumio: ");
        febrero = entrada.nextLine();
        
        System.out.println("En Marzo usted consumio: ");
        marzo = entrada.nextLine();
        
        System.out.println("En Abril usted consumio: ");
        abril = entrada.nextLine();
        
        System.out.println("En Mayo usted consumio: ");
        mayo = entrada.nextLine();
        
        System.out.println("En Junio usted consumio: ");
        junio = entrada.nextLine();
        
        System.out.println("En Julio usted consumio: ");
        julio = entrada.nextLine();
        
        System.out.println("En Agosto usted consumio: ");
        agosto = entrada.nextLine(); 
        
        System.out.println("En Septiembre usted consumio: ");
        septiembre = entrada.nextLine();
        
        System.out.println("En octubre usted consumio: ");
        octubre = entrada.nextLine();
        
        System.out.println("En Noviembre usted consumio: ");
        noviembre = entrada.nextLine();
        
        System.out.println("En Diciembre usted consumio: ");
        diciembre = entrada.nextLine();
        
        TotalAnual = (Double.parseDouble(enero) + Double.parseDouble(febrero) + Double.parseDouble(marzo) + Double.parseDouble(abril) 
        + Double.parseDouble(junio) + Double.parseDouble(julio) +Double.parseDouble(agosto) + Double.parseDouble(septiembre) 
        + Double.parseDouble(octubre) + Double.parseDouble(noviembre) + Double.parseDouble(diciembre));
    
        System.out.println("Su total anual es de " + TotalAnual + "Litros de agua");
        
        promedioAnual = (TotalAnual / 12);
        
       
     
    }
    
}
