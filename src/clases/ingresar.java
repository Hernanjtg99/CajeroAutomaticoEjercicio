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
public class ingresar extends cerebro{
    
   
    @Override
    public void saldo()
            {
                Scanner teclado= new Scanner(System.in);
                
                System.out.println("Ingresa el dinero que vas a meter en la cuenta ");
                
                ingresar= teclado.nextInt();
        saldo=saldo+ingresar;
        
    }
}
