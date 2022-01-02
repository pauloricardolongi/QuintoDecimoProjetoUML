package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28, 23.14);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);

	}
	/*lista de origem vai ser uma lista de qualquer tipo numerico extends Number.
	 A lista de destino pode ser qualquer tipo que pode ser um supertipo de Number*/
	public static void copy(List<? extends Number> source, List<? super Number> destino) {
		for(Number number : source) {
			destino.add(number);
		}
	}
	public static void printList(List<?>list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

	}


