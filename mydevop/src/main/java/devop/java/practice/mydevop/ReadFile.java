package devop.java.practice.mydevop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> res = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<>();
		File file = new File("example");
		try {
			Scanner in = new Scanner(file);
			while(in.hasNextLine()) {
				String sentence = in.nextLine();
				process(sentence, res, map);
				
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(res);
	}
	//check the condition for words
	//if it appears more 5 times and is more than 3 characters long
	//we add it to the result.
	private static void process(String sentence, List<String> res, Map<String, Integer> map) {
		String[] words = sentence.split(" ");
		for(String word: words) {
			if(word.length() > 3) {
				if(map.containsKey(word) && map.get(word) + 1 > 5) {
					String ans = reverse(word);
					res.add(ans);
				}else {
					map.put(word, map.getOrDefault(word, 0) + 1);
				}
			}
		}
		
	}
	//reversing the words
	private static String reverse(String word) {
		int left = 0;
		int right = word.length() - 1;
		char[] ch = word.toCharArray();
		while(left < right) {
			swap(ch, left, right);
			left++;
			right--;
		}
		return new String(ch);
	}
	private static void swap(char[] ch, int left, int right) {
		char temp = ch[left];
		ch[left] = ch[right];
		ch[right] = temp;
 	}

}
