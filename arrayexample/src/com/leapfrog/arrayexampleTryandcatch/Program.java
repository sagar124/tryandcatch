/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.arrayexampleTryandcatch;

/**
 *
 * @author sohn
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        int[] nums=new int[3];
        
        nums[0]=10;
        nums[1]=23;
        nums[2]=13;
        nums[3]=45;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
                }
    }
}
