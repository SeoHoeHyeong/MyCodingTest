package code11_04;

import java.util.Scanner;

public class 바이러스 {
	//방문 여부 확인
	static boolean []visited;
	//쌍을 저장할 행렬
	static int [][] map;
	//감염된 바이러스 컴퓨터 숫자
	static int answer;
	static int N, M;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//컴퓨터의 수(노드)
		 N = input.nextInt();
		//연결되어 있는 컴퓨터의 쌍의 수(간선)
		 M = input.nextInt();
		//조건 1번 컴퓨터가 시작(V가 1인 경우)
		
		visited = new boolean[N+1]; 
		map = new int[N+1][N+1];
		 for(int i = 0; i < M; i++) {
			 int x = input.nextInt();
			 int y = input.nextInt();
			 map[x][y] = map[y][x] = 1;
		 }
		 
		 dfs(1);
		 System.out.println(answer);
	}
	//dfs로 구현 
	static void dfs(int V) {
		visited[V] = true;
		
		for(int i = 1; i <= N; i++) {
			if(map[V][i] == 1 && !visited[i]) {
				dfs(i);
				answer++;
			}
		}
	}

}
