/*
Given two numbers m and n . Print all combinations of strings made with exactly m number of a and n number of b.
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Flipkart {
	public static void main(String[] args) {
		List<String> result = findCombinations(3, 2);
		for (String string : result) {
			System.out.println(string);
		}
	}

	private static List<String> findCombinations(int m, int n) {
		Set<String> resList = new HashSet<>();
		recur(0, 0, m, n, "", resList);
		return new ArrayList<>(resList);
	}

	private static void recur(int i, int j, int m, int n, String current, Set<String> resList) {
		if (i >= m && j >= n) {
			resList.add(current);
			return;
		}
		if(i<m)recur(i + 1, j, m, n, current + "a", resList);
		if(j<n)recur(i, j + 1, m, n, current + "b", resList);
	}
}
