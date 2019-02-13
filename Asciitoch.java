/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asciitoch;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Asciitoch {
    static Scanner kb = new Scanner(System.in);

   
    public static void main(String[] args) {
        int opcion;
        do{
            mostrarMenu();
            opcion=kb.nextInt();
            
        switch(opcion){
            case 1:
                asciiAChar();
                break;
                
            case 2:
                
                charAAscii();
                break;
             
            case 0 :
                break;
                
            default:
                System.out.println("Opciòn no valida");
        }
        
        }
        
        while(opcion !=0);
    }
    
    private static void mostrarMenu(){
        System.out.println("MENU");
        System.out.println("1. Convertir de Ascii a Caracter");
        System.out.println("2. Convertir de Caracter a Ascii");
        System.out.println("0. Salir");
        System.out.println("Introduce la opciòn");
    }
    
    private static void asciiAChar(){
      
        String data = JOptionPane.showInputDialog("Introduce el código Ascii");
        
        int d = Integer.parseInt(data);
        char c = (char)(d);
        
        System.out.println(data +"="+ c);
    }
    
    private static void charAAscii(){
     
        String data = JOptionPane.showInputDialog("Introduce chars");
        
        System.out.println(data);
        for (int i = 0; i< data.length(); i++){
            int as = data.charAt(i);
            System.out.println(as);
        }
        
       
    }
    
}
