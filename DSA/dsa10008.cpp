#include<iostream>
#include<string.h>
#include<vector>
#include<queue>
using namespace std;
#define ll long long
#define pii pair<int, int>

int n, m, u;
vector<pair<int, int> > adjlist[1001];
bool visited[1001];
int d[1001];
const int INF = 1e9;

void input(){
	cin >> n >> m >> u;
	for(int i = 1; i <= n; i++){
		adjlist[i].clear();
	}
	memset(visited, false, sizeof(visited));
	while(m--){
		int x, y, z;
		cin >> x >> y >> z;
		adjlist[x].push_back({y, z});
		adjlist[y].push_back({x, z});
	}
}

void dijkstra(){
	for(int i = 1; i <= n; i++){
		d[i] = INF;
	}
	d[u] = 0;
	priority_queue<pii, vector<pii>, greater<pii> > q;
	q.push({0, u});
	while(!q.empty()){
		pii top = q.top();
		q.pop();
		int v = top.second, w = top.first;
		if(visited[v])
			continue;
		visited[v] = true;
		for(auto au : adjlist[v]){
			int v1 = au.first, w1 = au.second;
			if(!visited[v1]){
				d[v1] = min(d[v1], d[v] + w1);
				q.push({d[v1], v1});
			}
		}
	}
	for(int i = 1; i <= n; i++){
		cout << d[i] << " ";
	}
	cout << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		input();
		dijkstra();	
	}
}

// #include<iostream>
// #include<string.h>
// #include<set>
// using namespace std;

// int n, m, u;
// int w[1001][1001];
// int d[1001];
// set<int> s;


// void input(){
// 	cin >> n >> m >> u;
// 	for(int i = 1; i <= n; i++){
// 		for(int j = 1; j <= n; j++){
// 			if(i == j){
// 				w[i][j] = 0;
// 			}
// 			else {
// 				w[i][j] = 1e9;
// 			}
// 		}
// 	}
// 	while(m--){
// 		int x, y, z;
// 		cin >> x >> y >> z;
// 		w[x][y] = z;
// 	}
// }

// void dijkstra(){
// 	for(int i = 1; i <= n; i++){
// 		s.insert(i);
// 	}
// 	d[u] = 0;
// 	s.erase(u);
// 	for(int v : s){
// 		d[v] = w[u][v];
// 	}
// 	while(!s.empty()){
// 		int dmin = 1e9;
// 		int mark;
// 		for(int v : s){
// 			if(d[v] < dmin){
// 				dmin = d[v];
// 				mark = v; 
// 			}
// 		}
// 		d[mark] = dmin;
// 		s.erase(mark);
// 		for(int v : s){
// 			if(d[v] > dmin + w[mark][v]){
// 				d[v] = dmin + w[mark][v];
// 			}
// 		}
// 	}
// 	for(int i = 1; i <= n; i++){
// 		cout << d[i] << " ";
// 	}
// 	cout << endl;
// }


// int main(){
// 	freopen("Inputc++.in", "r", stdin);
// 	// freopen("Outputc++.out", "w", stdout);
// 	int t;	cin >> t;
// 	while(t--){
// 		input();
// 		dijkstra();	
// 	}
// }
