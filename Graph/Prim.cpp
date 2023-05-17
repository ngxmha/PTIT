#include<iostream>
#include<vector>
#include<queue>
#include<limits.h>
#include<string.h>
#include<algorithm>
using namespace std;
const int Max = 101;

bool cmp(pair<int,int> a, pair<int, int> b){
    return a.first < b.first;
}
class Graph{
    private:
        int n, start;
        int a[Max][Max];
        bool used[Max];
        int parent[Max], dist[Max];
        vector<pair<int, int>> adj[Max];
    public:
        void input(){
            cin >> n >> start;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    cin >> a[i][j];
                    if(a[i][j]){
                        adj[i].push_back({j, a[i][j]});
                    }
                }
                for(int i = 1; i <= n; i++){
                    dist[i] = INT_MAX;
                }
                memset(used, false, sizeof(used));
            }
        }
        
        // void Prim(){
        //     priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
        //     pq.push({0, start});
        //     int dH = 0;
        //     vector<pair<int, int>> mst;
        //     while(!pq.empty()){
        //         pair<int, int> s = pq.top();
        //         pq.pop();
        //         int V = s.second, W = s.first;
        //         if(used[V]) continue;
        //         used[V] = true;
        //         dH += W;
        //         if(start != V){
        //             if(V < parent[V])
        //                 mst.push_back({V, parent[V]});
        //             else
        //                 mst.push_back({parent[V], V});
        //         }
        //         for(pair<int, int> p : adj[V]){
        //             int w = p.second, x = p.first;
        //             if(!used[x] && w < dist[x]){
        //                 pq.push({w, x});
        //                 dist[x] = w;
        //                 parent[x] = V;
        //             }
        //         }
        //     }
        //     if(mst.size() < n - 1)
        //         return;
        //     sort(mst.begin(), mst.end(), cmp);
        //     cout << "dH = " << dH << endl;
        //     for(int i = 0; i < mst.size(); i++){
        //         cout << mst[i].first << " " << mst[i].second << endl;
        //     }
        // }
        
        void Prim(){
            int dH = 0;
            vector<pair<int, int>> mst;
            used[start] = true;
            while(mst.size() < n - 1){
                int X, Y, min_w = INT_MAX;
                for(int i = 1; i <= n; i++){
                    if(used[i]){
                        for(pair<int, int> p : adj[i]){
                            int u = p.first, w = p.second;
                            if(!used[u] && w < min_w){
                                X = i; Y = u; min_w = w;
                            }
                        }
                    }
                }
                used[Y] = true;
                if(X < Y)
                    mst.push_back({X, Y});
                else 
                    mst.push_back({Y, X});
                dH += min_w;
            }
            if(mst.size() < n - 1)
                return;
            cout << "dH = " << dH << endl;
            for(int i = 0; i < mst.size(); i++){
                cout << mst[i].first << " " << mst[i].second << endl;
            }
        }
        
};

int main(){
    freopen("Inputc++.in", "r", stdin);
    Graph g;
    g.input();
    g.Prim();
}