#include<iostream>
#include<vector>
#include<string.h>
#include<queue>
using namespace std;

vector<int> adjList[1001];
bool visited[1001];

void bfs(int u){
	queue<int> q;
	q.push(u);
	visited[u] = true;
	while(!q.empty()){
		int v = q.front();
		q.pop();
		cout << v << " ";
		for(int t : adjList[v]){
			if(!visited[t]){
				visited[t] = true;
				q.push(t);
			}
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
	bfs(u);
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
	