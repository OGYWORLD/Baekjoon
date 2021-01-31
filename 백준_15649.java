/* 벡준 15649번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B15649 {
	// 주석이 N=4, M=2 임을 가정하고 달았습니다...^^...
	public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int[] a; // 출력용 배열
	static boolean[] isVisited; // 해당 노드를 방문했는지
	
	// 백트래킹 함수
	public static void BackTracking(int N, int M, int depth) throws NumberFormatException, IOException{
		// 우리가 찾고자 하는 depth까지 도달을 했다.
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				bw.write(a[i] + " ");
			}
			bw.write("\n");
		}
		
		// 그게 아니라면 해당 노드를 조사할 노드인지 검사하고 조사한다.
		else {
			for(int i = 0; i < N; i++) {
				// 방문했는 가? 그니깐 이게 N이 4니깐 (1~4, 1~4) 이렇게 올 수 있다. 이때 x좌표는 for문이 돌면서 1부터 들어가는 거고
				//그 다음에 y좌표는 isVisited가 각 배열방에 1~4를 각각 맡아서 검사하는 거다. 
				if(!isVisited[i]) { // 그래서 만약 이게 첫 번째 if문이었다면 x좌표가 1일때 y좌표가 1일때를 방문했냐고 묻는 거다.
					isVisited[i] = true; // 해당 노드는 이제 방문했으니 true
					a[depth] = i + 1; // 방문 안 했다면 배열 a에 넣어주는데 이거를 상태 공간 트리라고 보면 재귀가 호출 되지 않은 맨 처음의 상태에서
					// x좌표를 집어 넣는 건데 그 다음 호출을 통해서 y좌표를 관리해주는 고런 느낌인거다.
					// 그니깐 첫 트리에는 x좌표인 1이 들어가고 그 자식 트리에 y좌표인 2부터 보면서 다시 되돌아가고 다시 새 자식 3을 보고 이런 느낌이기 때문에
					// 배열 a의 인덱스는 depth가 되는 것이다.
					BackTracking(N, M, depth + 1);
					// 재귀호출이 다시 돌아오면 x좌표가 업데이트 됐을 때 (1에서 2라든지) 다시 새로운 새 환경에서 돌아야 하니깐 false로 바꿔준다.
					isVisited[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// n과 m 입력받기
		String s = bf.readLine() + " ";
		String[] split = s.split(" ");
	
		int N = Integer.parseInt(split[0]);
		int M = Integer.parseInt(split[1]);
		
		// 배열 크기 넣어주기
		a = new int[M];
		isVisited = new boolean[N];
		
		//백트래킹
		BackTracking(N, M, 0);
		
		bw.flush();
		bw.close();

	}

}
