#include<iostream>
using namespace std;

int u, v;
int parent[1001], size[1001];
bool check;

void make_set(){
	for(int i = 1; i <= u; i++){
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
	if(u == v){
		check = 1;
		return;
	}
	if(size[u] < size[v])
		swap(u, v);
	parent[v] = u;
	size[u] += size[v];
}

void testcase(){
	cin >> u >> v;
	check = 0;
	make_set();
	while(v--){
		int x, y;
		cin >> x >> y;
		Union(x, y);
	}
	if(check)
		cout << "YES\n";
	else
		cout << "NO\n";
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
