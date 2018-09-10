/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc310_test;

import edu.frostburg.cosc310.lab00.BinkleyBrandonLab00;

/**
 *
 * @author SK
 */
public class COSC310_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinkleyBrandonLab00 lab = new BinkleyBrandonLab00();
        System.out.println(lab.problem0(9999));
        System.out.println(lab.problem1(9999));
        System.out.println(lab.problem2());
        
        //I noticed that arraylist tend to run faster than linkedlist in all 
        //test, but I was unable to test for large sizes of list due to processing limitations
    }
    
}
