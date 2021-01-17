import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10989 {
	
	// count 정렬 사용!!!!!!!! -> 입력받는 수가 10000이하로 정해졌기 때문

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		
		int[] a = new int[10001];
		
		for(int i = 0; i < n; i++) {
			a[Integer.parseInt(bf.readLine())]++;
		}
		
		// 입력받기 종료
		bf.close();
		
		for(int i = 1; i < 10001; i++) {
			while(a[i] != 0) {
				sb.append(i).append("\n");
				a[i]--;
			}
		}
		
		bw.write(sb + "");
		
		
		bw.flush();
		bw.close();

	}

}
