#include<iostream>
#include<vector>
#include<string.h>
using namespace std;

int V, E;
int color[1001];
vector<int> adjlist[1001];

bool dfs(int u)
{
	color[u] = 1;
	for(int v : adjlist[u])
	{
		if(color[v] == 0)
		{
			if(dfs(v))
				return true;
		}
		else if(color[v] == 1)
			return true;
	}
	color[u] = 2;
	return false;
}

void input(){
	cin >> V >> E;
	for(int i = 1; i <= V; i++){
		adjlist[i].clear();
	}
	memset(color, 0, sizeof(color));
	while(E--){
		int x, y;
		cin >> x >> y;
		adjlist[x].push_back(y);
	}
}

void solve(){
	for(int i = 1; i <= V; i++){
		if(color[i] == 0){
			if(dfs(i)){
				cout << "YES\n";
				return;
			}
		}
	}
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