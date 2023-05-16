#include<iostream>
#include<string.h>
#include<vector>
using namespace std;

const int Max = 1001;
int k, n, m;
vector<int> adjlist[Max];
int a[Max], b[Max];
bool visited[Max];

void dfs(int u){
	visited[u] = true;
	b[u]++;
	for(int v : adjlist[u]){
		if(!visited[v]){
			dfs(v);
		}
	}
}

void input(){
	cin >> k >> n >> m;
	for(int i = 1; i <= k; i++){
		cin >> a[i];
	}
	for(int i = 0; i < m; i++){
		int x, y;
		cin >> x >> y;
		adjlist[x].push_back(y);
	}
}

void solve(){
	for(int i = 1; i <= k; i++){
		memset(visited, false, sizeof(visited));
		dfs(a[i]);
	}
	int cnt = 0;
	for(int i = 1; i <= n; i++){
		if(b[i] == k)
			cnt++;
	}
	cout << cnt;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t = 1;	//cin >> t;
	while(t--){
		input();
		solve();	
	}
}

