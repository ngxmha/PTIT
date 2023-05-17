#include<iostream>
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
};
void Graph::dataInput(){
    cin>>n;
    for(int i=1; i<=n; i++)
        for(int j=1; j<=n; j++) 
			cin>>A[i][j];
}
void Graph::graphInit(){
    for(int i=1; i<=n; i++) 
		chuaxet[i]=1;
}
void Graph::vertexVisit(int v){
    cout<<v<<" ";
	chuaxet[v]=0;
}
void Graph::recursiveDFS(int u){
    vertexVisit(u);
    for(int v=1; v<=n; v++)
        if(chuaxet[v])  
			recursiveDFS(v);
}

int main(){
    Graph g;
    g.dataInput();
//	g.graphInit();
//	g.recursiveDFS(1);
}
