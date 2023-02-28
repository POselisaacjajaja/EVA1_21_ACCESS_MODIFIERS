/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author isaaczapatto
 */
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    
    public void prueba(){
        //Todas estas clases están en Paquete1
        //Mismo paquete, public y default son visibles
        ClaseB objB = new ClaseB();
        //objB.defaultB;
        //objB.publicB;
        
        ClaseC objC = new ClaseC();
        
        //objC.publicC;
        //objC.defaultC;
        
        
        ClaseD objD = new ClaseD();
        
        //objD.defaultD;
        //objD.publicD;
        
        //Clases del paquete2
        //Todo o que sea default es ahora invisible
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClaseF --> es default y no es visibles desde otro paquete
        //ClaseF objF = new ClaseF();
        
    }
    
    
}


class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;
}