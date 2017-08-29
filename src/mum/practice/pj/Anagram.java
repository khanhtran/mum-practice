package mum.practice.pj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import mum.practice.Solution;

public class Anagram extends Solution {

	public Anagram() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void solve2() {
		// TODO Auto-generated method stub
		super.solve2();
		output = isAnagram("", "");
		printResult();
	}

	private Object isAnagram(String string1, String string2) {
		Map<Character, Integer> charMap1 = calculateMap(string1);
		Map<Character, Integer> charMap2 = calculateMap(string2);

		Iterator<Character> it = charMap1.keySet().iterator();
		while (it.hasNext()) {
			char c = it.next();
			int count1 = charMap1.get(c);
			int count2 = 0;
			if (charMap2.containsKey(c)) {
				count2 = charMap2.get(c);
			}
			if (count2 != count1) {
				return 0;
			}
//			charMap1.remove(c);
			it.remove();
			charMap2.remove(c);
		}
		if (!charMap2.isEmpty()) {
			return 0;
		}
		return 1;
	}

	private Map<Character, Integer> calculateMap(String string1) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : string1.toCharArray()) {
			if (map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count + 1);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		new Anagram().solve2();
	}

}
