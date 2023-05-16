#include<iostream>
#include<string.h>
#include<vector>
using namespace std;

int v, e;
bool visited[1001];
vector<int> adjList[1001];
int parent[1001], size[1001];

void make_set(){
	for(int i = 1; i <= v; i++){
		parent[i] = i;
		size[i] = 1;
	}
}

int find(int u){
	if(u == parent[u])
		return u;
	return parent[u] = find(parent[u]);
}

void Union(int u, int v){
	int a = find(u);
	int b = find(v);
	if(a != b){
		if(size[a] < size[b])
			swap(a, b);
		size[a] += size[b];
		parent[b] = a;
	}
}

void dfs(int u){
	visited[u] = true;
	for(int v : adjList[u]){
		if(!visited[v]){
			Union(u, v);
			dfs(v);
		}
	}
}

void testcase(){
	cin >> v >> e;
	make_set();
	memset(visited, false, sizeof(visited));
	for(int u = 1; u <= v; u++){
		adjList[u].clear();
	}
	for(int i = 1; i <= e; i++){
		int x, y;
		cin >> x >> y;
		adjList[x].push_back(y);
		adjList[y].push_back(x);
	}
	for(int i = 1; i <= v; i++){
		if(!visited[i])
			dfs(i);
	}
	int q;
	cin >> q;
	while(q--){
		int x, y;
		cin >> x >> y;
		if(parent[x] == parent[y])
			cout << "YES\n";
		else 
			cout << "NO\n";
	}
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
