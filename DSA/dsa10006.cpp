#include<iostream>
#include<vector>
#include<string.h>
using namespace std;

int n, m, u;
bool visited[1001];
vector<int> adjlist[1001];
vector<pair<int, int> > tree;

void dfs(int u){
	visited[u] = true;
	for(int v : adjlist[u]){
		if(!visited[v]){
			tree.push_back({u, v});
			dfs(v);
		}
	}
}

void solve(){
	dfs(u);
	if(tree.size() < n - 1){
		cout << "-1\n";
		return;
	}
	for(auto i : tree){
		cout << i.first << " " << i.second << endl;
	}
}


void testcase(){
	cin >> n >> m >> u;
	memset(visited, false, sizeof(visited));
	for(int i = 1; i <= n; i++){
		adjlist[i].clear();
	}
	tree.clear();
	while(m--){
		int x, y;
		cin >> x >> y;
		adjlist[x].push_back({y});
		adjlist[y].push_back({x});
	}
	solve();
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	