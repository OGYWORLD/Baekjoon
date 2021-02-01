import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine()); // 사람 수를 저장하는 변수 n
		
		// 키와 몸무게를 담을 클래스 (몸무게. 키)
		class form{
			int kg;
			int cm;
			
			form(int kg, int cm){
				this.kg = kg;
				this.cm = cm;
			}
		}
		
		form[] inform = new form[n];
		
		for(int i = 0; i < n; i++) {
			inform[i] = new form(0,0);
		}
		
		// 문자열로 입력받아서 쪼개기
		String split = "";
		for(int i = 0; i < n; i++) {
			split += bf.readLine() + " ";
		}
		
		String[] s = split.split(" ");
		
		int index = 0; // 아래에서 쓰일 인덱스용 변수
		for(int i = 0; i < n; i++) {
			inform[i].kg = Integer.parseInt(s[index]);
			index++;
			inform[i].cm = Integer.parseInt(s[index]);
			index++;
		}
		
		int count = 0; // 해당 사람보다 덩치 큰 사람이 몇명이나 되는 지 확인하는 변수 count
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(inform[i].kg < inform[j].kg && inform[i].cm < inform[j].cm) { // 덩치가 큰 가 조사
					count++;
				}
			}
			count++;
			bw.write(count + " ");
			
			count = 0;
	
		}

				
		bw.flush();
		bw.close();

	}

}
