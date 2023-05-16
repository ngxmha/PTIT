#include<iostream>
using namespace std;

int parent[100001], size[100001];
int n, m;
int res;

void make_set(){
	for(int i = 1; i <= n; i++){
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
	u = find(u);
	v = find(v);
	if(u != v){
		if(size[u] < size[v])
			swap(u, v);
		parent[v] = u;
		size[u] += size[v];
		res = max(res, size[u]);
	}
}

void testcase(){
	cin >> n >> m;
	make_set();
	res = 0;
	while(m--){
		int u, v;
		cin >> u >> v;
		Union(u, v);
	}
	cout << res << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	