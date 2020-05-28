/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

/**
 *
 * @author Notebook
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temperatura;
        temperatura = 8;
        
        if(temperatura <= 16 && temperatura >= 10 ){
            System.out.println("Funcionamiento normal");
        } else if(temperatura > 17 && temperatura < 50){
            System.out.println("Alerta enviada...");
        } 
        // + Rango de 0-9
        else{
            System.out.println("Sin datos");
            System.out.println("Alerta enviada");
        }
        
        
        
    }
    
}
