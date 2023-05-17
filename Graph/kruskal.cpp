#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
#define Max 101

struct Edge{
    int dau, cuoi, trongso;  
};

bool cmp(Edge a, Edge b){
    if(a.trongso == b.trongso){
        if(a.dau == b.dau)
            return a.cuoi < b.cuoi;
        return a.dau < b.dau;
    }
    return a.trongso < b.trongso;
}

class Graph{
private:
    int n;
    int a[Max][Max];
    int parent[Max], size[Max];
    vector<Edge> edge;
    vector<int> adj[Max];
public:
    void input(){
        cin >> n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                cin >> a[i][j];
                if(a[i][j] && i < j){
                    edge.push_back({i, j, a[i][j]});
                }
            }
        }
    }

    void make_set(){
        for(int i = 1; i <= n; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int u){
        if(u == parent[u])
            return u;
        return parent[u] = find(parent[u]);
    }

    bool Union(int u, int v){
        u = find(u);
        v = find(v);
        if(u == v)
            return false;
        if(size[u] < size[v])
            swap(u, v);
        parent[v] = u;
        size[u] += size[v];
        return true;
    }

    void kruskal(){
        sort(edge.begin(), edge.end(), cmp);
        vector<pair<int, int>> tree;
        int dH = 0;
        for(int i = 0; i < edge.size(); i++){
            if(tree.size() == n - 1)
                break;
            if(Union(edge[i].dau, edge[i].cuoi)){
                tree.push_back({edge[i].dau, edge[i].cuoi});
                dH += edge[i].trongso;
            }
        }
        if(tree.size() < n - 1)
            return;
        cout << "dH = " << dH << endl;
        for(int i = 0; i < tree.size(); i++){
            cout << tree[i].first << " " << tree[i].second << endl;
        }
    }
};

int main(){
    freopen("Inputc++.in", "r", stdin);
    Graph g;
    g.input();
    g.make_set();
    g.kruskal();
}