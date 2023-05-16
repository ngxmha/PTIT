#include<iostream>
#include<vector>
using namespace std;

// vector<int> adjList[1001];

void testcase(){
	int v, e;
	cin >> v >> e;
	vector<int> adjList[v + 1];
	while(e--){
		int x, y;
		cin >> x >> y;
		adjList[x].push_back(y);
	}
	for(int i = 1; i <= v; i++){
		cout << i << ": ";
		for(int j = 0; j < adjList[i].size(); j++)
			cout << adjList[i][j] << " ";
		cout << endl;
	}
	// for(int i = 1; i <= v; i++){
	// 	adjList[i].clear();
	// }
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	