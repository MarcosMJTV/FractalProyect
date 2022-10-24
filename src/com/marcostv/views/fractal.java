package com.marcostv.views;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import com.marcostv.model.linea;

public class fractal extends JPanel{
	public ArrayList<linea> arrayLinea = new ArrayList<linea>();
	 double sin60=Math.sin(3.14/3.);
	 public static int nivel_de_recursividad = 2;



	public fractal() {
		 
	 }
	 
	 
	

	@Override
	public void paint(Graphics g){
		for (linea l : arrayLinea) {
			paintRecursivo(g,nivel_de_recursividad,l.getxA(),l.getyA(),l.getxB(),l.getyB());
		}
		
		System.out.println(nivel_de_recursividad);
	 }
	
	private void paintRecursivo(Graphics g, int i, double xA1, double yA1, double xB1, double yB1 ) {
	 double dx=(xB1-xA1)/3.;
	 double dy=(yB1-yA1)/3.;
	 double xx=xA1+3*dx/2.+dy*sin60;
	 double yy=yA1+3*dy/2.-dx*sin60;
	 if(i<=0){
	      g.drawLine((int)xA1,(int)yA1,(int)xB1,(int)yB1);
	 }
	 else{
	     paintRecursivo(g,i-1,xA1,yA1,xA1+dx,yA1+dy);
	     paintRecursivo(g,i-1,xA1+dx,yA1+dy,xx,yy);
	     paintRecursivo(g,i-1,xx,yy,xB1-dx,yB1-dy);
	     paintRecursivo(g,i-1,xB1-dx,yB1-dy,xB1,yB1);
	 }
	}

}
