#include<iostream>
using namespace std;

int N;
int par[1001], sz[1001];
int check;

void make_set(){
	for(int i = 1; i <= N; i++){
		par[i] = i;
		sz[i] = 1;
	}
}

int find(int u){
	if(u == par[u])
		return u;
	return par[u] = find(par[u]);
}

void Union(int u, int v){
	u = find(u);
	v = find(v);
	if(u == v){
		check = true;
		return;
	}
	if(sz[u] < sz[v]){
		swap(u, v);
	}
	par[v] = u;
	sz[u] += sz[v];
}

void solve(){
	cin >> N;
	make_set();
	check = false;
	for(int i = 0 ; i < N - 1; i++){
		int x, y;
		cin >> x >> y;
		Union(x, y);
	}
	if(check)
		cout << "NO\n";
	else 
		cout << "YES\n";
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		solve();
	}
}
	