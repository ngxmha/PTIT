#include<iostream>
#include<vector>
#include<string.h>
#include<queue>
using namespace std;

#define pii pair<int, int>
const int maxn = 101, INF = 1e9;

class Graph{
private:
    int n, u;
    int a[maxn][maxn];
    bool visited[maxn];
    vector<pair<int, int> > adjlist[maxn];
    int d[maxn];
    int pre[maxn];
    
public:
    void input(){
        cin >> n >> u;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                cin >> a[i][j];
                if(a[i][j]){
                    adjlist[i].push_back({j, a[i][j]});
                }
            }
        }
    }

    void init(){
        for(int i = 1; i <= n; i++){
            d[i] = INF;
            visited[i] = false;
            pre[i] = 0;
        }
    }


    void dijkstra(){
        init();
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
                    if(d[v1] > d[v] + w1){
                        d[v1] = d[v] + w1;
                        q.push({d[v1], v1});
                        pre[v1] = v;
                    }
                }
            }
        }
        for(int i = 1; i <= n; i++){
            if(d[i] == INF){
                cout << "K/c " << u << " -> " << i << " = INF;" << endl;
            }
            else {
                cout << "K/c " << u << " -> " << i << " = " << d[i] << "; ";
                if(i == u){
                    cout << i << " <- " << u;
                }
                else {
                    int t = i;
                    // do {
                    //     cout << t << " <- ";
                    //     t = pre[t];
                    // } while(t != u);
                    while(t != u){
                        cout << t << " <- ";
                        t = pre[t];
                    }
                    cout << u;
                }
                cout << endl;
            }
        }
    }

};

int main(){
    freopen("Inputc++.in", "r", stdin);
    Graph g;
    g.input();
    g.dijkstra();
}

// 6

// 1

// 0   1   0   0   0   0

// 0   0   5   2   0   7

// 0   0   0   0   0   1

// 2   0   1   0   4   0

// 0   0   0   3   0   1

// 0   0   0   0   0   0
//    1   2   3   4   5   6   7   8   9   10  11  12  13
// 1  0   2   8   0   0   0   0   0   0   0   0   0   0
// 2  0   0   2   0   0   0   9   0   0   0   0   0   0
// 3  0   0   0   6   0   8   1   0   0   0   0   0   0
// 4  7   0   0   0   0   0   0   0   0   0   0   0   0
// 5  0   0   1   7   0   0   0   0   0   0   0   0   0
// 6  0   0   0   0   1   0   0   9   8   0   0   0   0
// 7  0   0   0   0   0   2   0   2   0   0   0   0   0
// 8  0   0   0   0   0   0   0   0   9   0   0   2   0
// 9  0   0   0   0   0   0   0   0   0   6   0   9   8
// 10 0   0   0   0   7   6   0   0   0   0   0   0   0
// 11 0   0   0   0   0   0   0   0   6   7   0   0   0
// 12 0   0   0   0   0   0   0   0   0   0   0   0   2
// 13 0   0   0   0   0   0   0   0   0   0   7   0   0