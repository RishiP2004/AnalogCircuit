/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Rishi
 */
public class VoltageSource extends CircuitComponent {
    public static int totalIds = 0;
    
    private final double voltage;
    
    public VoltageSource(double voltage, Node node1, Node node2) {
        super(node1, node2);
        Circuit.getInstance().addComponent(this);
        this.voltage = voltage;
        
        this.id = totalIds;
        totalIds++;
    }
 
    public double getVoltage() {
        return voltage;
    }
    
    public boolean nodesReversed() {
        return getNodes()[0].getId() > getNodes()[1].getId();
    }
    
    @Override
    public String toString() {
        if (nodesReversed()){
            return("V" + getId() + " " + getNodes()[1] + " " + getNodes()[0] + " DC " + -(this.voltage)); 
        
        } else {
            return("V" + getId() + " " + getNodes()[0] + " " + getNodes()[1] + " DC " + (this.voltage)); 
        } 
    }
}
