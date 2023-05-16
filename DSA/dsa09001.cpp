#include<iostream>
#include<vector>
using namespace std;

void testcase(){
	int v, e;
	cin >> v >> e;
	vector<int> adj[v + 1];
	while(e--){
		int m, n;
		cin >> m >> n;
		adj[m].push_back(n);
		adj[n].push_back(m);
	}
	for(int i = 1; i <= v; i++){
		cout << i << ": ";
		for(int u : adj[i]){
			cout << u << " ";
		}	
		cout << endl;	
	}
}

int main(){
	// freopen("Inputc++.in", "r", stdin);	
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
