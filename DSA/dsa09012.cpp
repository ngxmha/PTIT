#include<iostream>
#include<string.h>
#include<vector>
using namespace std;

bool visited[1001];
vector<int> adjList[1001];

void dfs(int u){
	visited[u] = true;
	for(int v : adjList[u]){
		if(!visited[v])
			dfs(v);
	}
}

void testcase(){
	int v, e;
	cin >> v >> e;
	for(int i = 1; i <= v; i++){
		adjList[i].clear();
	}
	memset(visited, false, sizeof(visited));
	for(int u = 1; u <= e; u++){
		int x, y;
		cin >> x >> y;
		adjList[x].push_back(y);
		adjList[y].push_back(x);
	}
	for(int u = 1; u <= v; u++){
		memset(visited, false, sizeof(visited));
		visited[u] = true;
		if(u == 1)
			dfs(2);
		else
			dfs(1);
		for(int i = 1; i <= v; i++){
			if(!visited[i]){
				cout << u << " ";
				break;
			}
		}
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
	