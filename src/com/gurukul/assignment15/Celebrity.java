package com.gurukul.assignment15;

import java.util.HashMap;

public class Celebrity {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	char arr[] = { 'A', 'B', 'A', 'C', 'B', 'D', 'D', 'A', 'B', 'C' };

	System.out.print(findCelebrity(arr));

    }

    public static char findCelebrity(char arr[]) {
	char ans = '0';
	HashMap<Character, Integer> map = new HashMap<>();
	for (int i = 0; i < arr.length; i += 2) {
	    char ch = arr[i];
	    map.put(ch, map.getOrDefault(map, 0) + 1);
	}
	for (int i = 0; i < arr.length; i++) {
	    if (!map.containsKey(arr[i])) {
		ans = arr[i];
	    }
	}
	return ans;

    }
}
