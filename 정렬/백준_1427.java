/* 백준 1427번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class B1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> a = new ArrayList<Integer>(); // 각 자리 수가 들어갈 배열
		
		// 입력받기
		String s = bf.readLine();
		int ss = Integer.parseInt(s);
		
		// 입력받은 숫자의 길이
		int line = s.length();
		int div = 0;
		
		for(int i = 0; i < line; i++) {
			div = (int)Math.pow(10, (double)(line - i - 1));
			a.add(ss / div);
			
			ss -= a.get(i) * div;
		}
		
		Collections.sort(a);
		Collections.reverse(a);
		
		for(int i = 0; i < line; i++) {
			bw.write(a.get(i) + "");
		}
		
		bw.flush();
		bw.close();

	}

}