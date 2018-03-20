package util;


import java.util.ArrayList;
import java.util.Collections;

public class RandomNumberGeneratorImpl implements RandomNumberGeneratorInterface {
	String numberString;

	public int generateRandomNumber() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		Collections.shuffle(list);
		
		for (int i = 0; i < 6; i++) {
			if (numberString != null) {
				numberString = numberString + list.get(i);
			} else {
				numberString = "" + list.get(i);
			}
		}
		int numberint = Integer.parseInt(numberString);
		return numberint;
	}
}

