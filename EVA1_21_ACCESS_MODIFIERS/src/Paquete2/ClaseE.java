/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import Paquete1.ClaseA;

/**
 *
 * @author isaaczapatto
 */
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
}

class ClaseF {
    public int publicF;
    int defaultF;
    private int privateF;
    
    public void prueba(){
        //La claseA está en otro paquete, pero es public, por lo que se puede ver.
        ClaseA objA = new ClaseA();
        //objA.publicA;
        
        //La claseD está en otro paquete y  es default, es invisible.
        //ClaseD objD = new ClaseD();
        
        
    }
    
}
