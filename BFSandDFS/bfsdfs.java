package code10_31;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfsAndDfs {
	//간선 연결상태를 저장할 행렬
	static int map[][];
	//방문 확인 여부
	static boolean []visited;
	static int N,M,V;
	static String answer = "";
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//정점의 개수
		 N = input.nextInt();
		
		//간선의 개수
		 M = input.nextInt();
		
		//탐색을 시작할 정점의 번호 V
		 V = input.nextInt();
		//정점과 간선을 표현하는 행렬
		map = new int [N+1][N+1];
		//방문 여부를 체크하는 배열 초기값 false
		visited = new boolean [N+1];
		for(int i = 0; i < M; i++) {	
			int x = input.nextInt();
			int y = input.nextInt();
			map[x][y] = map[y][x] = 1;  
		}
		
		dfs_matrix(V);
		
		visited = new boolean[N+1];
		System.out.println();
		bfs_matrix();
		
	}
	public static void dfs_matrix(int V) {
		//방문 여부를 true로 바꿈
		visited[V] = true;
		//해당 정점을 저장
		//값을 출력
		System.out.print(V + " ");
		for(int i = 1; i <= N; i++) {
			if(map[V][i] == 1 && !visited[i]) {
				dfs_matrix(i);
			}
		}
		
	}
	
	public static void bfs_matrix() {
		//큐로 bfs 구현 선입선출
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(V); //시작점을 Queue에 넣음
		visited[V] = true;
		System.out.print(V + " ");
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			for(int i = 1; i <= N; i++) {
				if(map[temp][i] == 1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
}
