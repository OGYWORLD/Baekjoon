/* 백준 1157번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1157 {
	
	static void mergeSort(int start, int end, int[] array, int size) {
		int[] newArray = new int[size];
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid, array, size);
			mergeSort(mid+1, end, array, size);
			
			int p = start;
			int q = mid + 1;
			int idx = p;
			
			while (p <= mid || q <= end) {
				if(q > end || (p <= mid && array[p] < array[q])) {
					newArray[idx++] = array[p++];
				}
				else {
					newArray[idx++] = array[q++];
				}
			}
			for(int i = start; i <= end; i++) {
				array[i] = newArray[i];
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] c = bf.readLine().toCharArray(); // 단어를 받아서 문자열로 변환한다.
		int l = c.length; // 받은 문자열의 길이
		int[] cnt = new int[91]; // 문자열의 개수를 세줄 정수형 배열
		int[] cnt2 = new int[91]; // 문자열의 개수를 세줄 정수형 배열2
		
		for(int i = 0; i < l; i++) {
			if(c[i] > 90) { // 해당 인덱스의 문자가 90보다 크다 = 소문자면
				c[i] = (char) (c[i] - 32); // 그 문자를 대문자로 (-32를 해서) 바꿔준다.
			}
			
			cnt[c[i]]++; // 해당 알파벳을 아스키코드표의 숫자로 봐서 인덱스로 활용한다.
			cnt2[c[i]]++;
		}
		
		// 제일 많이 등장한 알파벳 찾기 (병합정렬)
		mergeSort(65, 90, cnt2, 91); // 원본 배열 손상방지 cnt2
		
		if(cnt2[90] == cnt2[89]) { // 오름차순으로 정렬했는데 마지막 인덱스와 마지막-1 인덱스가 동일하다 = 가장 많이 사용된 알파벳이 2개 이상이다.
			bw.write("?");
		}
		else {
			for(int i = 65; i < 91; i++) {
				if(cnt[i] == cnt2[90]) { // cnt2[90] = 가장많이 등장한 알파벳의 개수, 그래서 cnt 중의 cnt2[90]을 찾으면 그 인덱스가 가장 많이
					// 사용된 인덱스이다.
					bw.write(((char)i) + "");
				}
			}
		}
		
		bw.flush();
		bw.close();

	}

}
