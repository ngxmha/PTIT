#include<iostream>
#include<vector>
#include<string.h>
#include<stack>
#include<queue>
using namespace std;

bool visited[1001];
vector<int> adjList[1001];
int pre[1001];

void dfs(int u){
	stack<int> st;
	st.push(u);
	visited[u] = true;
	while(!st.empty()){
		int v = st.top();
		st.pop();
		for(int t : adjList[v]){
			if(!visited[t]){
				visited[t] = true;
				pre[t] = v;
				st.push(v);
				st.push(t);
				break;
			}
		}
	}
}

void dfs2(int u){
	visited[u] = true;
	for(int v : adjList[u]){
		if(!visited[v]){
			pre[v] = u;
			dfs2(v);
		}
	}
}

void solve(int s, int t){
	if(pre[t] == 0){
		cout << "-1";
		return;
	}
	if(s == pre[t]){
		cout << s << " " << t << " ";
		return;
	}
	solve(s, pre[t]);
	cout << t << " ";
}

void testcase(){
	int v, e, s, t;
	cin >> v >> e >> s >> t;
	memset(visited, false, sizeof(visited));
	memset(pre, 0, sizeof(pre));
	for(int i = 1; i <= v; i++){
		adjList[i].clear();
	}
	while(e--){
		int x, y;
		cin >> x >> y;
		adjList[x].push_back(y);
	}
	dfs2(s);
	solve(s, t);
	cout << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}