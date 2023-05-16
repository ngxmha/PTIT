#include<iostream>
#include<vector>
#include<string.h>
using namespace std;

bool visited[1001];
vector<int> adjList[1001];

void dfs(int u){
	cout << u << " ";\
	visited[u] = true;
	for(int v : adjList[u]){
		if(!visited[v]){
			dfs(v);
		}
	}
}

void testcase(){
	int v, e, u;
	cin >> v >> e >> u;
	memset(visited, false, sizeof(visited));
	int m, n;
	while(e--){
		int m, n;
		cin >> m >> n;
		adjList[m].push_back(n);
		adjList[n].push_back(m);
	}
	dfs(u);
	for(int i = 1; i <= v; i++){
		adjList[i].clear();
	}
	cout << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	
