package aplicacao;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		//supertipo de qualquer tipo de lista?coringa
		List<?> myObjs = new ArrayList<Object>();
		List<Integer>myNumbers =new ArrayList<Integer>();
		myObjs = myNumbers;
		
		Object obj;
		Integer x = 10;
		obj = x;
		System.out.println(x);

	}

}
