/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.highlandersim.aspects;

import org.aspectj.lang.JoinPoint;

/**
 *
 * @author hcadavid
 */
public class AspectsAdvisor {

    int x=0;
    
    public void intercept(JoinPoint jp){
        x++;
        System.out.println("Intercepting!"+x+","+jp.getSignature());
    }
    
}
