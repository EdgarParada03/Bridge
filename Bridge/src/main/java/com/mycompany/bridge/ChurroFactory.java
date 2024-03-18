/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge;

/**
 *
 * @author edgar
 */
public abstract class ChurroFactory {
    //abstracccion
    protected ChurroMachine churroMachine;
    
    public ChurroFactory(ChurroMachine cm){
        churroMachine = cm;
    }
    
    public abstract void prepareChurro();
}
