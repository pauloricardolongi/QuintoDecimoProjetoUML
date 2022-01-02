package aplicacao;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		//com o tipo curinga podemos fazer m�todos que recebem um gen�rico de qualquer tipo
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
		}
		public static void printList(List<?> list) {
		for (Object obj : list) {
		System.out.println(obj);
		}

	}

}
