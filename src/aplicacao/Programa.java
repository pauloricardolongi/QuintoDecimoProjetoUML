package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Circulo;
import entidades.Retangulo;
import entidades.Shape;

public class Programa {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Retangulo(3.0, 2.0));
		myShapes.add(new Circulo(2.0));
		
		List<Circulo>meusCirculos = new ArrayList<Circulo>();
		meusCirculos.add(new Circulo(2.0));
		meusCirculos.add(new Circulo(3.0));
		
		
		
		System.out.println("Total area: " + totalArea(meusCirculos));
	}
	//uma lista de Shape podendo ser uma lista de qualquer tipo de subtipo de Shepe(Circulo)
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum = sum + s.area();
		}
		return sum;
		}

	}


