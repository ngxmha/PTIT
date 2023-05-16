#include<iostream>
#include<vector>
#include<queue>
using namespace std;

int N, M;
vector<int> adjlist[1001];
int color[1001];
int par[1001];

void input(){
	cin >> N >> M;
	for(int i = 1; i <= N; i++){
		adjlist[i].clear();
		color[i] = -1;
		par[i] = 0;
	}
	while(M--){
		int x, y;
		cin >> x >> y;
		adjlist[x].push_back(y);
		adjlist[y].push_back(x);
	}
}

bool bfs(int u){
	queue<int> q;
	q.push(u);
	color[u] = 1;
	while(!q.empty()){
		int v = q.front();
		q.pop();
		for(int x : adjlist[v]){
			if(color[x] == -1){
				color[x] = 1 - color[v];
				q.push(x);
			}
			else if(color[x] == color[v]){
				return false;
			}
		}
	}
	return true;
} 

bool dfs(int u){
	color[u] = 1 - color[par[u]];
	for(int v : adjlist[u]){
		if(color[v] == -1){
			par[v] = u;
			if(!dfs(v))
				return false;
		}
		else if(color[v] == color[u])
			return false;
	}
	return true;
}

void solve(){
	for(int i = 1; i <= N; i++){
		if(color[i] == -1){
			if(!dfs(i)){
				cout << "NO\n";
				return;
			}
		}
	}
	cout << "YES\n";
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		solve();
	}
}
	