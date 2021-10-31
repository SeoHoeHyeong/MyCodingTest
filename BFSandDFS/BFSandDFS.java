static int map[][];		    // 정점과 간선을 표현하는 행렬
                                    // 입력1로 예를 들면 map[1][2] == 1
                                    // 사이즈는 n+1로 지정 
static ArrayList<TreeMap<Integer, Integer>> arrayList;	// 인접리스트 표현
static LinkedList<Integer>[] adjList;			// 인접리스트 표현(LinkedList([]))
static boolean[] visited;		
static int n,m,v;			// 정점의 개수, 간선의 개수, 시작 정점
static String answer = "";
    
// 인접행렬로 구현한 DFS (정점의 개수가 작은 경우에만 사용하는걸 권장)
public static void dfs_adjacency_matrix(int v) {
	visited[v] = true;
	answer += v+" ";
	System.out.println(answer);
	for(int i=1;i<m;i++) {
		if(map[v][i] == 1 && !visited[i]) {
			dfs_adjacency_matrix(i);
		}
	}
}

// 인접리스트로 구현한 DFS
public static void dfs_adjacency_list(int v) {
	visited[v] = true;
	answer += v+" ";
	
	TreeMap<Integer, Integer> tmap = arrayList.get(v);
	for(int i : tmap.keySet()) {
		if(!visited[i]) {
			dfs_adjacency_list(i);
		}
	}
	
}

// 스택으로 구현한 DFS
public static void dfs_stack(int v) {
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(v);
	
	while(!stack.isEmpty()) {
		int vv= stack.pop();
		visited[vv] = true;	
		answer += vv+" ";
		
		for(int i=1; i<n+1;i++) {
			if(map[vv][i] == 1 && !visited[i]) {
				stack.push(i);			// stack에 담고 빠져나온다.
				break;
			}
		}
	}
	
}

// 큐로 구현한 BFS (인접행렬)
public static void bfs_queue_adjacency_matrix(int v) {
	Queue<Integer> q = new LinkedList<Integer>();
	q.offer(v);
	visited[v] = true;
	
	while(!q.isEmpty()) {
		int vv = q.poll();
		answer += vv+" ";
		
		for(int i=1; i<n+1 ; i++) {
			if(map[vv][i] == 1 && !visited[i]) {
				q.offer(i);			// queu에 담고 계속 진행 map[vv][i~n] 끝까지 탐색
				visited[i] = true;
			}
		}
	}
}

// 큐로 구현하는 BFS (인접리스트)
public static void bfs_queue_adjacency_list(int v){
	Queue<Integer> q = new LinkedList<Integer>();
	visited[v] = true;
	q.add(v);

	while(!q.isEmpty()){
		v = q.poll();
		answer += v +" ";
		
		Iterator<Integer> it = adjList[v].listIterator();
		while(it.hasNext()){
			int w = it.next();
			if(!visited[w]){
				visited[w]=true;
				q.add(w);
			}
		}
	}
}
