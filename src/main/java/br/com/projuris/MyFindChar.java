package br.com.projuris;

import br.com.projuris.FindCharachter;

public class MyFindChar implements FindCharachter {

	public char findChar(String word) {
		char[] chars = word.toCharArray();
		char charFound = ' ';
		
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				if (i == j) {
					continue;
				} else if (chars[i] == chars[j]) {
					charFound = ' ';
					break;
				}
				charFound = chars[i];
			}
			if (charFound != ' ') {
				break;
			}
		}
		return charFound;
	}

}
