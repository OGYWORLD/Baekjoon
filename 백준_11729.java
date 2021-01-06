import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class B11729 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void Hanoi(int n, int start, int mid, int to) throws IOException {

		if (n == 1) { // 더 이상 옮길 원반이 존재하지 않는다.
			bw.write(start + " " + to + "\n");
			return;
		}

		Hanoi(n - 1, start, to, mid); // 맨 마지막을 제외한 위의 원판들을 1기둥에서 2기둥으로 옮긴다.
		
		bw.write(start + " " + to + "\n"); // 이동한 거 출력
		
		Hanoi(n - 1, mid, start, to); // 그 다음 중간에 옮긴 걸 다시 3기둥으로 옮긴다.
 
	}


	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()); // 원반의 개수 
		
		String answer = (int)(Math.pow(2, n) - 1) + ""; // 출력할 String 변수 (bw로 바로 출력하니 수가 이상하게 나온다.) 이동 횟수 점화식 유도하면 2^n - 1로 나온다.
		
		String use = "";
		
		bw.write(answer + "\n"); // answer 출력
		
		Hanoi(n, 1, 2, 3);
		
		
		

		bw.flush();
		bw.close();
	}

}