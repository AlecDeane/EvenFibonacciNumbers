/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenfibonaccinumbers;

import java.util.ArrayList;

/**
 *
 * @author Alec
 */
public class EvenFibonacciNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Limit is 4000000
        int limit = 4000000;
        //setup initial two entries of sequence
        ArrayList<Integer> fibNums = new ArrayList<Integer>();
        fibNums.add(1);
        fibNums.add(2);
        Integer newFibNum;
        
        //setup summing variable with initial 2 as these are already in the ArrayList
        int sumEvenFibs = 2;
         
        //define fibonacci sequence while summing even numbers
        while(fibNums.get(fibNums.size() - 1) < limit){
            newFibNum = (fibNums.get(fibNums.size() - 1)) + (fibNums.get(fibNums.size() - 2));
            fibNums.add(newFibNum);
            
            //Check if adding to the sum of even Fibonacci numbers
            if(newFibNum % 2 == 0){
                sumEvenFibs += newFibNum;
            }
        }
        System.out.println("Sum of even Fibonacci Numbers up to " + limit + ": " + sumEvenFibs);
        
        
    }
    
}
