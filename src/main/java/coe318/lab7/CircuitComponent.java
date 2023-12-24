/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Rishi
 */
public class CircuitComponent {
    private Node[] nodes = new Node[2];
    protected int id;
    
    public CircuitComponent(Node node1, Node node2) {
        Circuit.testNodes(node1, node2);
        nodes[0] = node1;
        nodes[1] = node2;
    }
    
    public int getId() {
        return id;
    }
    
    public Node [] getNodes() {
        return nodes;
    }
}
