/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Rishi
 */
public class Resistor extends CircuitComponent {
    public static int totalIds = 0;
    
    private final double resistance;
    
    public Resistor(double resistance, Node node1, Node node2) {
        super(node1, node2);
        Circuit.getInstance().addComponent(this);
        this.resistance = resistance;
        
        this.id = totalIds;
        totalIds++;
    }
    
    public double getResistance() {
        return resistance;
    }
    
    @Override
    public String toString() {
        return "R" + getId() + " " + getNodes()[0] + " " + getNodes()[1] + " " + getResistance();    
    }
}
