/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public abstract class cerebro {
    
    int saldo=500,retirar=0,ingresar=0;
    
        public void mostrarmenu()
    {
         int opcion=0;
       
       while (opcion != 4)
       {
           System.out.println("digita una opcion");
           System.out.println("1.Revisa tu saldo");
           System.out.println("2.Retira tu saldo");
           System.out.println("3 ingresa tu saldo a la cuenta");
           System.out.println("4 salir");
           Scanner teclado = new Scanner(System.in);
           
           opcion= teclado.nextInt();
           switch(opcion)
           {
               case 1 -> System.out.println("Has seleccionado revisar tu saldo");
                     
                            
                   
               case 2 -> System.out.println("Has seleccionado retira tu saldo");
                   
               case 3 -> System.out.println(" Has seleccionado ingresa saldo a tu cuenta");
                   
               default -> {    
               }
                   
           }
       }
    }
    public void mostrarsaldo()
    {
        
        System.out.println("Tu saldo es de "+saldo);
    }
        public abstract void saldo();

}
