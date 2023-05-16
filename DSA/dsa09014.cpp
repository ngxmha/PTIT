#include<iostream>
#include<vector>
using namespace std;

int V, E;
int par[1001], sz[1001];
bool check;

void make_set(){
	for(int i = 1; i <= V; i++){
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
	}
	if(sz[u] < sz[v])
		swap(u, v);
	par[v] = u;
	sz[u] += sz[v];
}

void input(){
	cin >> V >> E;
	check = false;
	make_set();
	while(E--){
		int x, y;
		cin >> x >> y;
		Union(x, y);
	}
}

void solve(){
	if(check)
	    cout << "YES\n";
	else
	    cout << "NO\n";
}
int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		solve();
	}
}
	