/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Rishi
 */
public class Node {
    private int id;
    public static int totalIds = 0;
    
    public Node() {
        this.id = totalIds;
        totalIds++;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return Integer.toString(id);
    }
}
