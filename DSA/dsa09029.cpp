#include<iostream>
#include<vector>
#include<string.h>
using namespace std;

int n, m;
vector<int> adjlist[11];
bool visited[11];
int x[11];
bool check;

void hmt(int k){
	for(int u : adjlist[x[k - 1]]){
		if(k == n + 1){
			check = true;
			break;
		}
		else if(!visited[u]) {
			x[k] = u;
			visited[u] = true;
			hmt(k + 1);
			visited[u] = false;
		}
	}
}

void init(){
	for(int i = 1; i <= n; i++){
		x[1] = i;
		visited[i] = true;
		hmt(2);
		visited[i] = false;
	}
}

void input(){
	cin >> n >> m;
	memset(visited, false, sizeof(visited));
	memset(x, 0, sizeof(x));
	for(int i = 1; i <= n; i++){
		adjlist[i].clear();
	}
	while(m--){
		int x, y;
		cin >> x >> y;
		adjlist[x].push_back(y);
		adjlist[y].push_back(x);
	}
	check = false;
}

void testcase(){
	if(check)
		cout << "1\n";
	else 
		cout << "0\n";
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		input();
		init();	
		testcase();
	}
}
