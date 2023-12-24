/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

import java.util.ArrayList;
/**
 *
 * @author Rishi
 */
public class Circuit {
    private static Circuit instance = null; 
    private ArrayList<CircuitComponent> components;
    
    public static Circuit getInstance() {
        if (instance == null) { 
            instance = new Circuit();   
        }
        return instance;
    }
    
    private Circuit() {
        components = new ArrayList<CircuitComponent>();
    } //Yes, the constructor is PRIVATE!
    
    public void addComponent(CircuitComponent component) {
        components.add(component);
    }
    
    public static void testNodes(Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            throw new IllegalArgumentException("Nodes cannot be null");
        } else if (node1 == node2) {
            throw new IllegalArgumentException("Nodes cannot be equal");
        }
    }
    
    @Override
    public String toString() {
        String str = "";
        
        for(CircuitComponent c: components) {
            str += c.toString() + "\n";
        }
        return str;
    }
}

