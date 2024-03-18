/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge;

/**
 *
 * @author edgar
 */
public class MediumChurroFactory extends ChurroFactory{
    //abstraccion refinada
    public MediumChurroFactory(ChurroMachine cm){
        super(cm);
    }
    
    @Override
    public void prepareChurro() {
        System.out.println("Medium Churros");
        churroMachine.startChurroMachine();
        System.out.println(churroMachine.getChurro());
        System.out.println("_______________________");
    }
}
