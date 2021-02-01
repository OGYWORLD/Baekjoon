import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class B2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = Integer.parseInt(bf.readLine());
		
		// 배열로 담기
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(bf.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < n; i++) {
			bw.write(list.get(i) + "\n");
		}
		
		
		
		bw.flush();
		bw.close();

	}

}