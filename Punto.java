/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn3d;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Luis Martin R.P
 */
public class Punto{
    public double x,y,z;
    public int clase;
    
    void generar(float xl,float yl,float zl){
        x=Math.random()*xl;
        y=Math.random()*yl;
        z=Math.random()*zl;
    }
}
