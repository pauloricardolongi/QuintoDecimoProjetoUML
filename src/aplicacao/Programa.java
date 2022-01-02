package aplicacao;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		//não é possível adicionar  a  esta lista do tipo curinga
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
		}
		public static void printList(List<?> list) {
			list.add(3);
		for (Object obj : list) {
		System.out.println(obj);
		}

	}

}
