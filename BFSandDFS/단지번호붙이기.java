package code11_04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 단지붙이기 {
	//좌표를 나타냄 좌,하,상,우 순서
	static int [] dx = {1,0,-1,0};
	static int [] dy = {0,-1,0,1};
	static int [] aparts = new int[25*25];
	static int apartNum = 0; //아파트 단지 번호의 수
	static int N;
	//배열 저장
	static int [][] map;
	//방문 여부 확인
	static boolean [][] visited;
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		//지도의 크기(정사각형)
		 N  = input.nextInt();
		 //지도 저장
		 map = new int[N][N];
		 visited = new boolean[N][N];		 
		 String str="";
		 for(int i = 0; i < N; i++) {
		 str += input.next() + "\n";
		 }
		 StringTokenizer stk = new StringTokenizer(str, "\n");
		 String strInput;
		 int k = 0;
		 //지도 생성
		 while(stk.hasMoreTokens()) {
			 strInput = stk.nextToken();
			 for(int j = 0; j < N; j++) {
				 map[k][j] =(int)(strInput.charAt(j)-'0');
			 }
			 k++;
		 }
		 
		 
		 for(int i=0; i<N; i++){
	            for(int j=0; j<N; j++){
	                if(map[i][j] == 1 && !visited[i][j]){
	                    apartNum++;
	                    dfs(i,j);
	                }
	            }
	        }
		 Arrays.sort(aparts);
		 System.out.println(apartNum);
		 
		 for(int i = 0; i < aparts.length;i++) {
			 if(aparts[i] == 0) {
				 continue;
			 }else {
				 System.out.println(aparts[i]);
			 }
		 }
	}
	
	static void dfs(int x, int y) {
		visited[x][y] = true;
		aparts[apartNum]++;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if(map[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
		
	}

}
