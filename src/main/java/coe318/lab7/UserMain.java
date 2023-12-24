/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

import java.util.Scanner;
/**
 *
 * @author Rishi
 */
public class UserMain {
    private static boolean running = true;
    
    public static void main(String [] args) {
        run();
    }
    
    public static void run() {
        System.out.println("Start making the Circuit with resistors/voltage sources");

        Scanner scanner = new Scanner(System.in);
        
        while(running) {
           String input = scanner.nextLine();
           
            if (input.equals("end") || input.equals("END")) {
                end();
            } else if (input.equals("spice") || input.equals("SPICE")) {
                spice();
            } else if (input.startsWith("v") || input.startsWith("V")){
                String delimitter = "[ ]+";
                String[] line = input.split(delimitter);
     
                Node n1 = new Node();
                n1.setId(Integer.parseInt(line[1]));
                Node n2 = new Node();
                n2.setId(Integer.parseInt(line[2]));
                new VoltageSource(Double.parseDouble(line[3]), n1, n2);
            } else if(input.startsWith("r") || input.startsWith("R")){
                String delimitter = "[ ]+";
                String[] line = input.split(delimitter);
                                                 
                Node n1 = new Node();
                n1.setId(Integer.parseInt(line[1]));
                Node n2 = new Node();
                n2.setId(Integer.parseInt(line[2]));
                new Resistor(Double.parseDouble(line[3]),n1,n2);
            } else {
                incorrect();
            }   
        }
    }
    
    public static void spice() {
        System.out.println(Circuit.getInstance().toString());            
    }
    
    public static void incorrect() {
        System.out.println("Unknown syntax");
        System.out.println("Please enter a command, or 4 properties of a resistor or voltage source");
    }
    
    public static void end() {
        running = false;
    }
}
