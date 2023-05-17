#include<iostream>
using namespace std;

const int maxn = 101, INF = 1e9, null = -1;

class Graph{
private:
    int n;
    int a[maxn][maxn], d[maxn][maxn], next[maxn][maxn];
public:
    void input(){
        cin >> n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                cin >> a[i][j];
                if(i != j && a[i][j] == 0)
                    a[i][j] = INF;
            }
        }
    }
    
    void path(int u, int v){
        if(next[u][v] == null)
            return;
        while(u != v){
            cout << u << " --> ";
            u = next[u][v];
        }
        cout << v << endl;
    }
    
    void floyd(){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                d[i][j] = a[i][j];
                if(a[i][j] != 1e9)
                    next[i][j] = j;
                else 
                    next[i][j] = null;
            }
        }
        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(d[i][k] != 1e9 && d[k][j] != 1e9 && d[i][j] > d[i][k] + d[k][j]){
                        d[i][j] = d[i][k] + d[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                cout << "K/c " << i << " -> " << j << " = " << d[i][j] << "; ";
                path(i, j);
            }
        }
    }
};

int main(){
    freopen("Inputc++.in", "r", stdin);
    Graph g;
    g.input();
    g.floyd();
}