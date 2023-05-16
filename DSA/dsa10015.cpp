#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int n, m;
int parent[101], size[101];
vector<vector<int> > edge;

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
	if(u == v){
		return;
	}
	if(size[u] < size[v])
		swap(u, v);
	parent[v] = u;
	size[u] += size[v];
}

void kruskal(){
	int dh = 0;
	int cnt = 0;
	sort(edge.begin(), edge.end());
	for(int i = 0; i < edge.size(); i++){
		if(cnt == n - 1)
			break;
		int w = edge[i][0];
		int x = edge[i][1];
		int y = edge[i][2];
		if(find(x) != find(y)){
			dh += w;
			cnt++;
			Union(x, y);
		}
	}
	cout << dh;
}

void testcase(){
	cin >> n >> m;
	make_set();
	edge.clear();
	while(m--){
		int x, y, z;
		cin >> x >> y >> z;
		edge.push_back({z, x, y});
	}
	kruskal();
	cout << endl;
}
	
int main(){
	freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	