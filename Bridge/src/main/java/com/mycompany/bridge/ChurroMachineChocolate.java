/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge;

/**
 *
 * @author edgar
 */
public class ChurroMachineChocolate implements ChurroMachine{
    //implementador concreto A
    @Override
    public void startChurroMachine() {
        System.out.println("Starting Machine");
    }

    @Override
    public String getChurro() {
        return "Chocolate Churro";
    }
    
}
