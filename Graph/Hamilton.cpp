#include<iostream>
#include<vector>
#include<string.h>
using namespace std;
#define Max 101

class Graph{
 	private:
 		int n, start;
 		bool visited[Max];
 		int a[Max][Max];
 		vector<int> adj[Max];
 		int x[Max];
 	public:
 		void input(){
 			cin >> n >> start;
 			for(int i = 1; i <= n; i++){
 				for(int j = 1; j <= n; j++){
 					cin >> a[i][j];
 					if(a[i][j]){
 						adj[i].push_back(j);
 					}
 				}
 			}
 			memset(visited, false, sizeof(visited));
 		}

 		void hmt(int k){
 			for(int y : adj[x[k - 1]]){
 				if(k == n + 1 && y == start){
 					for(int i = 1; i <= k - 1; i++){
 						cout << x[i] << " ";
 					}
 					cout << start << endl;
 				}
 				else if(!visited[y]){
 					x[k] = y;
 					visited[y] = true;
 					hmt(k + 1);
 					visited[y] = false;
 				}
 			}
 		}

 		void hmt_cycle(){
 			x[1] = start;
 			visited[start] = true;
 			hmt(2);
 		}
};

int main(){
	Graph g;
	g.input();
	g.hmt_cycle();
}