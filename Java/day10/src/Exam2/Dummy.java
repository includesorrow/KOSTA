/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam2;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author KOSTA
 */
public class Dummy {
    public static void main(String[] args) {
        
    
     Set<Integer> lottoset = new TreeSet<Integer>();
        
    for(int i=0; i<=5; i++){
        int fori = (int)(Math.random()*45+1);
        lottoset.add(fori);
    }
        System.out.println(lottoset);
          
}
}