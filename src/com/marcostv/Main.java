package com.marcostv;

import com.marcostv.model.linea;
import com.marcostv.views.fractal;
import com.marcostv.views.views;
public class Main{


	public static void main(String[] args) {
		views v = new views();
		fractal f = new fractal();
		v.accesori();
		
		linea l1 = new linea(300,200,600,200);
		linea l2 = new linea(600,200,600,500);
		linea l3 = new linea(600,500,300,500); 
		linea l4 = new linea(300,500,300,200);
		f.arrayLinea.add(l1);
		f.arrayLinea.add(l2);
		f.arrayLinea.add(l3);
		f.arrayLinea.add(l4);
		v.add(f);
		
		
		
	
	}
	

	
	
	

}
