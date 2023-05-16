#include<iostream>
#include<vector>
#include<string.h>
using namespace std;

int n, m;
int deg_add[1001], deg_sub[1001];

void solve(){
	int even = 0, odd = 0;
	for(int i = 1; i <= n; i++){
		if(deg_add[i] == deg_sub[i]){
			even++;
		}
		// else {
		// 	if(deg_add[i] - deg_sub[i] == 1 || deg_sub[i] - deg_add[i] == 1)
		// 		odd++;
		// }
	}
	if(even == n) //|| odd == 2)
		cout << "1\n";
	else
		cout << "0\n";
}

void input(){
	cin >> n >> m;
	memset(deg_add, 0, sizeof(deg_add));
	memset(deg_sub, 0, sizeof(deg_sub));
	while(m--){
		int x, y;
		cin >> x >> y;
		deg_add[x]++;
		deg_sub[y]++;
	}
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		input();	
		solve();
	}
}
	