#include<iostream>
#include<vector>
using namespace std;
const int maxn = 101, INF = 1e9;

class Graph{
private:
    int n, s;
    int a[maxn][maxn], d[maxn], pre[maxn];
    
public:
    void input(){
        cin >> n >> s;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                cin >> a[i][j];
                if(i != j && a[i][j] == 0){
                    a[i][j] = INF;
                }
            }
        }
    }

    void bellman_ford(){
        for(int i = 1; i <= n; i++){
            d[i] = a[s][i];
            pre[i] = s;
        }
        d[s] = 0;
        for(int k = 1; k <= n - 1; k++){
            for(int v = 1; v <= n; v++){
                if(v != s){
                    for(int u = 1; u <= n; u++){
                        if(d[u] != INF && a[u][v] != INF && d[v] > d[u] + a[u][v]){
                            d[v] = d[u] + a[u][v];
                            pre[v] = u;
                        }
                    }
                }
            }
        }
        //     cout << k << endl;
        //     for(int i = 1; i <= n; i++){
        //         cout << i << " " << d[i] << " " << pre[i] << endl;
        //     }
        // }
        for(int u = 1; u <= n; u++){
            if(d[u] == INF){
                cout << "K/c " << s << " -> " << u << " = INF;\n";
            }
            else {
                cout << "K/c " << s << " -> " << u << " = " << d[u] << "; ";
                if(u == s){
                    cout << u << " <- " << u << endl;
                }
                else {
                    int t = u;
                    while(t != s){
                        cout << t << " <- ";
                        t = pre[t];
                    }
                    cout << s << endl;
                }
            }
        }
    }
};

int main(){
    freopen("Inputc++.in", "r", stdin);
    Graph g;
    g.input();
    g.bellman_ford();
}