#include<iostream>
#include<vector>
#include<stack>
#include<string.h>
using namespace std;

int V, E;
bool visited[1001];
vector<int> adjlist[1001], r_adjlist[1001];
stack<int> st;

void input(){
	cin >> V >> E;
	for(int i = 1; i <= V; i++){
		adjlist[i].clear();
		r_adjlist[i].clear();
	}
	while(E--){
		int x, y;
		cin >> x >> y;
		adjlist[x].push_back(y);
		r_adjlist[y].push_back(x);
	}
}

void dfs1(int u){
	visited[u] = true;
	for(int v : adjlist[u]){
		if(!visited[v]){
			dfs1(v);
		}
	}	
	st.push(u);
}

void dfs2(int u){
	visited[u] = true;
	for(int v : r_adjlist[u]){
		if(!visited[v]){
			dfs2(v);
		}
	}	
}

void solve(){
	memset(visited, false, sizeof(visited));
	for(int i = 1; i <= V; i++){
		if(!visited[i]){
			dfs1(i);
		}
	}
	int cnt = 0;
	memset(visited, false, sizeof(visited));
	while(!st.empty()){
		int u = st.top();
		st.pop();
		if(!visited[u]){
			cnt++;
			dfs2(u);
		}
	}
	if(cnt == 1)
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
