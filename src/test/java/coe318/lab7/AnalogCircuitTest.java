/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe318.lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rishi
 */
public class AnalogCircuitTest {

    Node node1 = new Node();
    Node node2 = new Node();
    
    public AnalogCircuitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    public void testNodes() {
         assertTrue(node1.getId() != node2.getId());
    }
    
    @Test
    public void testResistor() {
        Resistor r1 = new Resistor (-25, node1, node2);
        
        Node[] nodes = {node1, node2};
        assertTrue(r1.toString().contains("R0 2 3 -25.0"));
        assertArrayEquals(r1.getNodes(), nodes);
    }
    @Test
    public void testVoltageSource() {
        VoltageSource v1 = new VoltageSource (50, node1, node2);
        
        Node[] nodes = {node1, node2};
        assertTrue(v1.toString().contains("V0 0 1 DC -50.0"));
        assertArrayEquals(v1.getNodes(), nodes);
    }
    @Test
    public void testCircuit() {
        String string = Circuit.getInstance().toString();
        assertTrue(string.contains("R0 2 3 -25.0"));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
