#include<iostream>
using namespace std;

const int Max = 101;
int n, m;
char c[Max][Max];

int di[8] = {-1, -1, -1, 0, 0, 1, 1, 1};
int dj[8] = {-1, 0, 1, -1, 1, -1, 0 ,1};

void dfs(int i, int j){
	c[i][j] = '.';
	for(int k = 0; k < 8; k++){
		int i1 = i + di[k], j1 = j + dj[k];
		if(i1 >= 1 && i1 <= n && j1 >= 1 && j1 <= m && c[i1][j1] == 'W'){
			dfs(i1, j1);
		}
	}
}

void input(){
	cin >> n >> m;
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= m; j++){
			cin >> c[i][j];
		}
	}
}

void solve(){
	int cnt = 0;
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= m; j++){
			if(c[i][j] == 'W'){
				cnt++;
				dfs(i, j); 
			}
		}
	}
	cout << cnt;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t = 1;	//cin >> t;
	while(t--){
		input();	
		solve();
	}
}
