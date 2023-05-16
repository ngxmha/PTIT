// #include<iostream>
// #include<vector>
// #include<string.h>
// using namespace std;

// bool visited[1001];
// vector<int> adjList[1001];

// void dfs(int u){
// 	visited[u] = true;
// 	for(int v : adjList[u]){
// 		if(!visited[v])
// 			dfs(v);
// 	}
// }

// void testcase(){
// 	int v, e;
// 	cin >> v >> e;
// 	memset(visited, false, sizeof(visited));
// 	int connected_components = 0;
// 	while(e--){
// 		int x, y;
// 		cin >> x >> y;
// 		adjList[x].push_back(y);
// 		adjList[y].push_back(x);
// 	}
// 	for(int i = 1; i <= v; i++){
// 		if(!visited[i]){
// 			connected_components++;
// 			dfs(i);
// 		}
// 	}
// 	cout << connected_components << endl;
// 	for(int i = 1; i <= v; i++){
// 		adjList[i].clear();
// 	}
// }

// int main(){
// 	// freopen("Inputc++.in", "r", stdin);
// 	// freopen("Outputc++.out", "w", stdout);
// 	int t;	cin >> t;
// 	while(t--){
// 		testcase();
// 	}
// }
// 	

#include<iostream>
#include<string.h>
#include<set>
using namespace std;

int n, m;
int parent[1001], sz[1001];

void make_set(){
	for(int i = 1; i <= n; i++){
		parent[i] = i;
		sz[i] = 1;
	}
}

int find(int u){
	if(u == parent[u])
		return u;
	return parent[u] = find(parent[u]);
}

void Union(int u, int v){
	u = find(u);
	v = find(v);
	if(u == v)
		return;
	if(sz[u] < sz[v])
		swap(u, v);
	parent[v] = u;
	sz[u] += sz[v];
}

void input(){
	cin >> n >> m;
	// make_set();
	while(m--){
		int x, y;
		cin >> x >> y;
		Union(x, y);
	}
}

void testcase(){
	set<int> s;
	for(int i = 1; i <= n; i++){
		s.insert(parent[i]);
	}	
	cout << s.size() << endl;
    s.clear();
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		// testcase();
	}
}

