#include<iostream>
#include<vector>
using namespace std;

int n, m;
vector<int> adjlist[1001];

void solve(){
	int even = 0, odd = 0;
	for(int i = 1; i <= n; i++){
		if(adjlist[i].size() % 2 == 0)
			even++;
		else
			odd++;
	}
	if(even == n)
		cout << "2\n";
	else if(odd == 2)
		cout << "1\n";
	else 
		cout << "0\n";
}

void testcase(){
	cin >> n >> m;
	for(int i = 1; i <= n; i++){
		adjlist[i].clear();
	}
	while(m--){
		int x, y;
		cin >> x >> y;
		adjlist[x].push_back(y);
		adjlist[y].push_back(x);
	}
	solve();
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	