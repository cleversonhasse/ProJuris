package br.com.projuris;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.projuris.FindArray;

public class MyFindArray implements FindArray {

	public int findArray(int[] array, int[] subArray) {
		List<Integer> list1 = Arrays.stream(array).boxed().collect(Collectors.<Integer>toList());
		List<Integer> list2 = Arrays.stream(subArray).boxed().collect(Collectors.<Integer>toList());

		return Collections.lastIndexOfSubList(list1, list2);
	}

}
