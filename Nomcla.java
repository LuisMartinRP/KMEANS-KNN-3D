/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn3d;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;
/**
 *
 * @author Luis Martin R.P
 */
public class Nomcla {
    JPanel p;
    int c;
    int y=350,x=300;
    int[] re,gr,bl;
    Nomcla(JPanel p,int c,int[]re,int[]gr,int[]bl){
        this.p=p;
        this.c=c;
        this.re=re;
        this.gr=gr;
        this.bl=bl;
    }
    public void paint(){
        Graphics2D g=(Graphics2D)this.p.getGraphics();
        g.clearRect(297,347,400,500);
        for(int i=0;i<this.c;i++){
            Color col=new Color(re[i],gr[i],bl[i]);
            g.setColor(col);
            g.fillOval (x, y, 6, 6);
            g.drawString("Clase "+String.valueOf(i),x+4, y);
            y+=25;
        }
    }
}
