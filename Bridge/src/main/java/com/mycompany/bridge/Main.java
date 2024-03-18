/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bridge;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        //Create machines
        ChurroMachineChocolate cmChocolate = new ChurroMachineChocolate();
        ChurroMachineStrawberry cmStrawberry = new ChurroMachineStrawberry();
        
        //Create factories
        SmallChurroFactory smChurroFactory = new SmallChurroFactory(cmChocolate);
        MediumChurroFactory mdChurroFactory = new MediumChurroFactory(cmStrawberry);
        LargeChurroFactory lgChurroFactory = new LargeChurroFactory(cmChocolate);
        
        //Start factories
        smChurroFactory.prepareChurro();
        mdChurroFactory.prepareChurro();
        lgChurroFactory.prepareChurro();
    }
    
    //From: https://www.youtube.com/watch?v=uY6uEvvc578
}
