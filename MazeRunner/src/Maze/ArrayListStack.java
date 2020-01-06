/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze;
import DataStructures.*;
import java.util.ArrayList;
/**
 *
 * @author Ching Vang
 * @param <T>
 * @version 10/18/19
 */
public class ArrayListStack<T> implements StackADT<T> {
      // using array list as underlying data storage
      private final ArrayList<T> storage;
      /**
      * constructor initializing empty stack
      */
      public ArrayListStack() {
            storage = new ArrayList<>();
      }
      
    /**
     *adds an element to the top of the stack.
     * @param t
     */
    @Override
      
    public void push(T t) {
        // simply appending to the end of list
        storage.add(t);
    }
      /**
      * removes and returns the top element, throws EmptyCollectionException if
      * stack is empty
     * @return 
     * @throws DataStructures.EmptyCollectionException
      */
      @Override
      public T pop() throws EmptyCollectionException {
            if (storage.isEmpty()) {
                  // empty
                  throw new EmptyCollectionException("Stack is empty!");
            }
            // removing and returning element at last index
            return storage.remove(storage.size() - 1);
       }
      @Override
      public T peek() throws EmptyCollectionException {
            if (storage.isEmpty()) {
                  throw new EmptyCollectionException("Stack is empty!");
            }
            // returning element at last index
           return storage.get(storage.size() - 1);
      }
      /**
      * this method returns true if stack is empty, else false. Even though this
      * method is not there in StackADT, I think the importance of this method is
      * very much. Otherwise we would not know if the stack is empty or not
      * without using pop or peek and handling exceptions.
      * @return true if empty, false if not
      */
          @Override
      public boolean isEmpty() {
            return storage.isEmpty();
      }

    @Override
    public int size() {
        return storage.size();
    }
}
