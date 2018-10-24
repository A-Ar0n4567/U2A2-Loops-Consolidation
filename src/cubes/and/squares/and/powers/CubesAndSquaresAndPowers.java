/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cubes.and.squares.and.powers;
import java.util.Scanner;

/**
 *
 * @author aamir7110
 */
public class CubesAndSquaresAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in);
        
        int question,number,power,total,menu;
        
        menu = 0;
        
       do{
        
        System.out.println("1...Find The value Of A Number Squared");
        System.out.println("2...Find The Value Of A Number Cubed");
        System.out.println("3...Find The Value Of Any Number To Any Power");
        System.out.println("4...Exit");
       
        
        question = keyedInput.nextInt();
       
        if(question ==1){
    
            System.out.println("Enter The Number You Want Squared:");
            
            number = keyedInput.nextInt();
            
            System.out.println(number+" Squared Is: "+number*number);
        }
        if(question ==2){
            System.out.println("Enter The Number You Want Cubed:");
            
            number = keyedInput.nextInt();
            
            System.out.println(number+" Cubed Is: "+number*number*number);
           
        }
        if(question==3){
        
            
            System.out.println("Enter The Number:");
            
            number = keyedInput.nextInt();
            
            System.out.println("Enter The Exponent:");
            
            power = keyedInput.nextInt();
        
            total =1;
            
            for(int i =0; i <= power-1; i = i + 1){
                 
                total = total*number;
                 
            }
            System.out.println(number+" To The Exponent "+power+" is "+total);
        }
        if(question == 4){
            menu =1;
            System.out.println("GoodBye");
        }
        
       }while(menu==0);
    }
    
}
