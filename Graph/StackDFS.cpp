#include<iostream>
#include<stack>
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
        for(int j=1; j<=n; j++) cin>>A[i][j];
}
void Graph::graphInit(){
    for(int i=1; i<=n; i++) chuaxet[i]=1;
}
void Graph::vertexVisit(int v){
    cout<<v<<" ";   chuaxet[v]=0;
}

void Graph::stackDFS(int u){
    stack<int> nxep;
    nxep.push(u);
    vertexVisit(u);
    while(!nxep.empty()){
        int s = nxep.top();
	    nxep.pop();
        for(int t=1; t<=n; t++)
            if(chuaxet[t]){
                nxep.push(s); 
				nxep.push(t); 
				vertexVisit(t);
				break;
            }
    }
}
int main(){
    Graph g;
    g.dataInput();  g.graphInit();  g.stackDFS(1);
}
