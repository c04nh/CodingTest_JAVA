// 1단계
// 문자열 내 마음대로 정렬하기

import java.util.*;

class Solution211004 {
	public String[] solution(String[] strings, int n) {
		List<String> list = new ArrayList<String>();
		for (String str : strings) {
			list.add(str);
		}

		list.sort(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {

				return str1.charAt(n) - str2.charAt(n) == 0 ? 
						str1.compareTo(str2) : str1.charAt(n) - str2.charAt(n);
			}
		});
		String[] answer = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}