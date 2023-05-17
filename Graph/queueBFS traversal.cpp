#include<iostream>
#include<stack>
#include<queue>
#define MAX 100
using namespace std;
class Graph{
private:
	int A[MAX][MAX], n;
	bool chuaxet[MAX];
public:
	void dataInput();
	void graphInit();
	void vertexVisit(int v);
	void recursiveDFS(int u);
	void stackDFS(int u);
	void queueBFS(int u);
};
void Graph::dataInput(){
	cin>>n;
	for(int i=1; i<=n; i++)
		for(int j=1; j<=n; j++) cin>>A[i][j];
	}
void Graph::graphInit(){
	for(int i=1; i<=n; i++) chuaxet[i]=1;
}
void Graph::vertexVisit(int v){
	cout<<v<<" "; chuaxet[v]=0;
}
void Graph::recursiveDFS(int u){
	vertexVisit(u);
	for(int v=1; v<=n; v++)
		if((A[u][v]==1)&&(chuaxet[v]==1)) recursiveDFS(v);
}
void Graph::stackDFS(int u){
	stack<int> nxep;
	nxep.push(u);
	vertexVisit(u);
	while(!nxep.empty()){
		int s=nxep.top(); nxep.pop();
		for(int t=1; t<=n; t++)
			if((A[s][t]==1)&&(chuaxet[t]==1)){
				nxep.push(s); nxep.push(t); vertexVisit(t); break;
			}
		}
	}
	void Graph::queueBFS(int u){
		queue<int> hangdoi;
		hangdoi.push(u); vertexVisit(u);
		while(!hangdoi.empty()){
			int s=hangdoi.front(); hangdoi.pop();
			for(int v=1; v<=n; v++)
				if((A[s][v]==1)&&(chuaxet[v]==1)){
					vertexVisit(v); hangdoi.push(v);
				}
			}
		}
		int main(){
			Graph g;
g.dataInput(); g.graphInit(); //g.stackDFS(1); //g.recursiveDFS(1);
g.queueBFS(1);
}
