/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze;

import DataStructures.EmptyCollectionException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ching Vang
 * @version 10/18/19
 */
public class ArrayListStackTest {
    private ArrayListStack<Integer> stack;
    
    public ArrayListStackTest() {
    }
    
    @Before
    public void setUp() {
        stack=new ArrayListStack<>();
    }
    
    //@After
    //public void tearDown() {
    //}
    
    public void testArrayListStackConstructor() {
        stack=new ArrayListStack<>();
        assertEquals(stack.isEmpty(), true);
    }
    
    /**
     * Test of push method, of class ArrayListStack.
     * @throws DataStructures.EmptyCollectionException
     */
    @Test
    public void testPush() throws EmptyCollectionException {
        assertEquals(stack.isEmpty(), true);
        stack.push(1);
        assertEquals(stack.peek(), (Integer)1);
        stack.push(2);
        assertEquals(stack.peek(), (Integer)2);
        stack.push(3);
        assertEquals(stack.peek(), (Integer)3);
    }
    /**
     * Test of pop method, of class ArrayListStack.
     * @throws DataStructures.EmptyCollectionException
     */
    @Test
    public void testPop() throws EmptyCollectionException {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(stack.pop(), (Integer)3);
        assertEquals(stack.pop(), (Integer)2);
        assertEquals(stack.pop(), (Integer)1);
    }

    /**
     * Test of peek method, of class ArrayListStack.
     * @throws DataStructures.EmptyCollectionException
     */
    @Test
    public void testPeek() throws EmptyCollectionException {
        stack.push(1);
        assertEquals(stack.peek(), (Integer)1);
        stack.push(2);
        assertEquals(stack.peek(), (Integer)2);
        stack.pop();
        assertEquals(stack.peek(), (Integer)1);
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     * @throws DataStructures.EmptyCollectionException
     */
    @Test
    public void testIsEmpty()  throws EmptyCollectionException { 
        assertEquals(stack.isEmpty(), true);
        stack.push(1);
        assertEquals(stack.isEmpty(), false);
        stack.pop();
        assertEquals(stack.isEmpty(), true);
    }
    
}
