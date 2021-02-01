/* 백준 11651번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B11651 {
	
	public static class Point implements Comparable<Point>{
		private int x;
		private int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		@Override
		public int compareTo(Point p) {
			Integer tmp = new Integer(this.getX());
			Integer tmp_2 = new Integer(this.getY());
			int result = tmp_2.compareTo(p.getY());
			if(result == 0) {
				result = tmp - p.getX();
			}
			return result;

		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Point> p = new ArrayList<>();
		
		// 좌표 개수 받기
		int n = Integer.parseInt(bf.readLine());
		
		String s = "";
		String[] ss;
		for(int i = 0; i < n; i++) {
			s = bf.readLine() + " ";
			ss = s.split(" ");
			p.add(new Point(Integer.parseInt(ss[0]), Integer.parseInt(ss[1])));
		}
		
		// 정렬
		Collections.sort(p);
		
		for(int i = 0; i < n; i++) {
			bw.write(p.get(i).x + " " + p.get(i).y +"\n");
		}
		
		
		bw.flush();
		bw.close();

	}

}