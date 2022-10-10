/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.ordering;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author iTTaste
 */
public class PizzaOrdering {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double bill=0;
        //ArrayList for the owners of pizza hutt
        ArrayList<String> owner=new ArrayList();
        owner.add("Ali");
        owner.add("Asad");
        owner.add("Ahsan");
        owner.add("Malik");
        
        //Important Variables
        boolean ch=true;
        String name;
        int num;
        Scanner scan =new Scanner(System.in);
        
        //do-while for menu
        do{
            bill=0;
            System.out.println("******************************");
            System.out.println("******************************");
            System.out.print("Please Enter Your Name: ");
            name=scan.next();
            System.out.println("******************************");
            System.out.println("******************************");
            System.out.println("Press 1 for Small Pizza Rs=140/-");
            System.out.println("Press 2 for Medium Pizza Rs=280/-");
            System.out.println("Press 3 for Large Pizza Rs=500/-");
            System.out.print("Press 0 to exit: ");
            num=scan.nextInt();
            
                    //if-else conditions for Pizza Size
            if(num==1){
                bill+=140;
                
            }
            else if(num==2){
                bill+=280;
                
            }
            else if(num==3){
                bill+=500;
                
            }
            System.out.println("******************************");
            System.out.println("Press 1 for Stuffed Crust Rs=40/-");
            System.out.println("Press 2 for Cheese Crust Rs=60/-");
            System.out.println("Press 3 for Cracker Crust Rs=80/-");
            System.out.print("Press 0 to exit: ");
            num=scan.nextInt();
            
                    //if-else conditions for Pizza Crust
            if(num==1){
                bill+=40;
            }
            else if(num==2){
                bill+=60;
            }
            else if(num==3){
                bill+=80;
            }
            
            System.out.println();
            System.out.println();
            System.out.println("Press 1 for Mushroom Rs=30/-");
            System.out.println("Press 2 for Fresh Garlic Rs=20/-");
            System.out.println("Press 3 for Extra Cheese Rs=50/-");
            System.out.print("Press 0 to exit: ");
            num=scan.nextInt();
            
                    //if-else conditions for Pizza Topping
            if(num==1){
                bill+=30;
            }
            else if(num==2){
                bill+=20;
            }
            else if(num==3){
                bill+=50;
            }
            
            
            System.out.print("Press 1 to CONTINUE \n Press 0 to EXIT: ");
            int a=scan.nextInt();
            ch = a != 0;
            if(!ch){
                System.out.println();
                System.out.println();
                System.out.print("\nBill for Mr."+name+"\n");
                System.out.println();
                System.out.println();
                if(owner.contains(name)){
                    System.out.println("10% discount of Rs="+bill/10+"/-");
                    bill-=bill/10;
                }
                
            }
        }while(ch);
    }
    
}
