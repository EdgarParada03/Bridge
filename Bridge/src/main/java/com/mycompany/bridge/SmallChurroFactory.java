/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge;

/**
 *
 * @author edgar
 */
public class SmallChurroFactory extends ChurroFactory{
    //abstraccion refinada
    public SmallChurroFactory(ChurroMachine cm){
        super(cm);
    }
    
    @Override
    public void prepareChurro() {
        System.out.println("Small Churros");
        churroMachine.startChurroMachine();
        System.out.println(churroMachine.getChurro());
        System.out.println("_______________________");
    }
    
}
