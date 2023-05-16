#include<iostream>
#include<vector>
#include<string.h>
#include<algorithm>
using namespace std;

int N, M;
int par[1001];
bool visited[1001];
vector<int> adjlist[1001];
int en;

bool dfs(int u){
	visited[u] = true;
	for(int v : adjlist[u]){
		if(!visited[v]){
			par[v] = u;
			if(dfs(v))
				return true;
		}
		else if(v != par[u] && v == 1){
			en = u;
			return true;
		}
	}
	return false;
}

void input(){
	cin >> N >> M;
	for(int i = 1; i <= N; i++){
		adjlist[i]. clear();
	}
	memset(visited, false, sizeof(visited));
	// memset(par, 0, sizeof(par));
	while(M--){
		int x, y;
		cin >> x >> y;
		adjlist[x].push_back(y);
		adjlist[y].push_back(x);
	}
	for(int i = 1; i <= N; i++){
		sort(adjlist[i].begin(), adjlist[i].end());
	}
}

void solve(){
	if(dfs(1)){
		vector<int> v;
		v.push_back(1);
		while(en != 1){
			v.push_back(en);
			en = par[en];
		}
		v.push_back(1);
		for(int i = v.size() - 1; i >= 1; i--){
			cout << v[i] << " ";
		}
		cout << v[0] << endl;
	}
	else{
		cout << "NO\n";
	}
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		solve();
	}
}
	