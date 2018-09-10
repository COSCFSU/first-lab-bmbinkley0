/*
 * Brandon Binkley
 * Sept 7 2018
 * 
 */
package edu.frostburg.cosc310.lab00;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author bmbinkley0
 */
public class BinkleyBrandonLab00 implements Lab00{
  
    /**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Makes a long string using Java StringBuilder
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    @Override
    public long problem2(){
     
        ArrayList<String> arrayList = new ArrayList<String>();
        long arrayStart = System.currentTimeMillis();
        for (int i=0; i<9999999; i++) {
            arrayList.add(Integer.toString(i));
        }
        long arrayEnd = System.currentTimeMillis();
        
        long arrayTime = arrayEnd - arrayStart;
        System.out.println("ArrayList Time: "+arrayTime + " ms");
       
        
         LinkedList<String> linkedList = new LinkedList<String>();
        long linkedStart = System.currentTimeMillis();
         for (int i=0; i<9999999; i++) {
            linkedList.add(Integer.toString(i));
        }
        long linkedEnd = System.currentTimeMillis();
        
        long linkedTime = linkedEnd- linkedStart;
        System.out.println("LinkedList Time: "+linkedTime + " ms");
        
        
        System.out.print("Difference in times: ");
        return Math.abs(arrayTime-linkedTime);
        
        
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    

}
