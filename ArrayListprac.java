/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author suhani
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListprac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        ArrayList <Integer>al=new ArrayList();
        al.add(100);
        al.add(3);
        Scanner s=new Scanner(System.in);
        char c;
        do{
            System.out.print("Enter data");
            num=s.nextInt();
            al.add(num);
            s.nextLine();
            System.out.println("ADD MORE?");
            c=s.nextLine().charAt(0);
            
        }while(c=='y');
        System.out.println(al);
    }
    
}
