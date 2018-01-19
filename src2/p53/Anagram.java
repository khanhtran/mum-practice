package p53;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public Anagram() {
		// TODO Auto-generated constructor stub
	}

	int areAnagrams(char[] a1, char[] a2) {
		Map<Character, Integer> charMap1 = new HashMap<>();
		Map<Character, Integer> charMap2 = new HashMap<>();

		for (char c : a1) {
			if (charMap1.containsKey(c)) {
				int count = charMap1.get(c);
				charMap1.put(c, count + 1);
			} else {
				charMap1.put(c, 1);
			}
		}
		for (char c : a2) {
			if (charMap2.containsKey(c)) {
				int count = charMap1.get(c);
				charMap2.put(c, count + 1);
			} else {
				charMap2.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : charMap1.entrySet()) {
			char key = entry.getKey();
			int value = entry.getValue();

			if (charMap2.containsKey(key)) {
				int value2 = charMap2.get(key);
				if (value2 != value) {
					return 0;
				}
			} else {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		assert new Anagram().areAnagrams(new char[] { 's', 'i', 't' }, new char[] { 'i', 't', 's' }) == 1;
		assert new Anagram().areAnagrams(new char[] { 's', 'i', 't' }, new char[] { 'i', 'd', 's' }) == 0;
		System.out.println("Done");
	}
}
