#include<iostream>
#include<queue>
#include<string.h>
#include<vector>
#include<queue>
using namespace std;

bool visited[1001];
vector<int> adjList[1001];

void bfs(int u){
	queue<int> q;
	q.push(u);
	visited[u] = true;
	while(!q.empty()){
		int v = q.front();
		q.pop();
		for(int i = 0; i < adjList[v].size(); i++){
			int t = adjList[v][i];
			if(!visited[t]){
				visited[t] = true;
				q.push(t);
			}
		}
	}
}

void testcase(){
	int v, e;
	cin >> v >> e;
	memset(visited, false, sizeof(visited));
	for(int u = 1; u <= v; u++){
		adjList[u].clear();
	}
	while(e--){
		int x, y;
		cin >> x >> y;
		adjList[x].push_back(y);
		adjList[y].push_back(x);
	}
	int connected_components = 0;
	for(int u = 1; u <= v; u++){
		if(!visited[u]){
			connected_components++;
			bfs(u);
		}
	}
	cout << connected_components << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	