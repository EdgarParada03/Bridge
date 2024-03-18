/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge;

/**
 *
 * @author edgar
 */
public class ChurroMachineStrawberry implements ChurroMachine{
    //implementador concreto B
    @Override
    public void startChurroMachine() {
        System.out.println("Starting Machine");
    }

    @Override
    public String getChurro() {
        return "Strawberry Churro";
    }
}
