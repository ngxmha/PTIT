#include<iostream>
#include<set>
#include<string.h>
#include<vector>
using namespace std;

bool visited[1001];
set<int> adjList[1001];

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
	memset(visited, false, sizeof(visited));
	for(int i = 1; i <= v; i++){
		adjList[i].clear();
	}
	vector<pair<int, int> > edgeList; 
	for(int i = 1; i <= e; i++){
		int x, y;
		cin >> x >> y;
		adjList[x].insert(y);
		adjList[y].insert(x);
		edgeList.push_back({x, y});
	}
	for(int i = 0; i < edgeList.size(); i++){
		int u = edgeList[i].first, t = edgeList[i].second;
		memset(visited, false, sizeof(visited));
		adjList[u].erase(t);
		adjList[t].erase(u);
		dfs(1);
		for(int i = 1; i <= v; i++){
			if(!visited[i]){
				cout << u << " " << t << " ";
				break;
			}
		}
		adjList[u].insert(t);
		adjList[t].insert(u);
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
