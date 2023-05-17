#include<iostream>
#include<vector>
#include<stack>
#include<set>
using namespace std;
#define MAX 101

class Graph{
private:
    int n, u, a[MAX][MAX];
    set<int> adj[MAX];
public:
    void input(){
        cin >> n >> u;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                cin >> a[i][j];
                if(a[i][j]){
                    adj[i].insert(j);
                }
            }
        }
    }

    void euler_cycle(){
        stack<int> st;
        vector<int> ce;
        st.push(u);
        while(!st.empty()){
            int s = st.top();
            if(!adj[s].empty()){
                int x = *adj[s].begin();
                st.push(x);
                adj[s].erase(x);
                adj[x].erase(s);
            }
            else{
                ce.push_back(s);
                st.pop();
            }
        }
        for(int i = ce.size() - 1; i >= 0; i--){
            cout << ce[i] << " ";
        }
    }
};

int main(){
    Graph g;
    g.input();
    g.euler_cycle();
}