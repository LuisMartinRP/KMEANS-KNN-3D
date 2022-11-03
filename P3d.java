/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn3d;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.analysis.AnalysisLauncher;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Scatter;
import org.jzy3d.plot3d.rendering.canvas.Quality;
/**
 *
 * @author Luis Martin R.P
 */
public class P3d extends AbstractAnalysis{
    ArrayList<Punto> puntos = new ArrayList<Punto>();
    Color colores[];
    int c;
    boolean clas;
    P3d(ArrayList<Punto> puntos,Color colores[],int c){
        this.puntos=puntos;
        this.colores=colores;
        this.c=c;
    }
    public void paint()throws Exception{
        AnalysisLauncher.open(new P3d(this.puntos,this.colores,this.c));
        init();
    }

    @Override
    public void init() throws Exception {
        chart = AWTChartComponentFactory.chart();
        Coord3d[] points = new Coord3d[this.puntos.size()];
        Color[] colors = new Color[this.puntos.size()];
                     
        for(int i=0;i<this.puntos.size();i++){
            points[i] = new Coord3d(this.puntos.get(i).x, this.puntos.get(i).y, this.puntos.get(i).z);
            for(int j=0;j<this.c;j++){
                if(j==this.puntos.get(i).clase){
                    colors[i] = this.colores[j];
                }
            }
        }

        Scatter scatter = new Scatter(points, colors,5);
        chart.add(scatter);
        chart.getScene();
    }
}
