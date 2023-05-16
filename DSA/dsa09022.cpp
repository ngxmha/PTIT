#include<iostream>
#include<string.h>
#include<vector>
using namespace std;

vector<int> adjList[1001];
bool visited[1001];

void dfs(int u){
	cout << u << " ";
	visited[u] = true;
	for(int i = 0; i < adjList[u].size(); i++){
		int v = adjList[u][i];
		if(!visited[v]){
			dfs(v);
		}
	}
}

void testcase(){
	int v, e, u;
	cin >> v >> e >> u;
	memset(visited, false, sizeof(visited));
	while(e--){
		int x, y;
		cin >> x >> y;
		adjList[x].push_back(y);
	}
	dfs(u);
	cout << endl;
	for(int i = 1; i <= v; i++){
		adjList[i].clear();
	}
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	