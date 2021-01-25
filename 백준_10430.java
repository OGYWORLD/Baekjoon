/*백준 10430번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10430 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 두 숫자 받기
		String numbers = bf.readLine() + " ";
		
		String[] s = numbers.split(" ");
		
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int C = Integer.parseInt(s[2]);
		
		int first = (A+B)%C;
		int secound = ((A%C) + (B%C))%C;
		int third = (A*B)%C;
		int forth = ((A%C) * (B%C))%C;

		bw.write(first + "\n" + secound + "\n" + third + "\n" + forth);
		
		bw.flush();
		bw.close();

	}

}
