#include<iostream>
using namespace std;

int n, m;
// int dx[8] = {-1, -1, -1, 0, 0, 1, 1, 1};
// int dy[8] = {-1, 0, 1, -1, 1, -1, 0, 1};
bool a[1001][1001];

void dfs(int i, int j, int dx[], int dy[]){
	a[i][j] = 0;
	for(int k = 0; k < 8; k++){
		int i1 = i + dx[k];
		int j1 = j + dy[k];
		if(i1 >= 1 && i1 <= n && j1 >= 1 && j1 <= m && a[i1][j1]){
			dfs(i1, j1, dx, dy);
		}
	}
}

void testcase(){
	cin >> n >> m;
	int *dx = new int[8]{-1, -1, -1, 0, 0, 1, 1, 1};
	int *dy = new int[8]{-1, 0, 1, -1, 1, -1, 0, 1};
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= m; j++){
			cin >> a[i][j];
		}
	}	
	int cnt = 0;
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= m; j++){
			if(a[i][j]){
				cnt++;
				dfs(i, j, dx, dy);
			}
		}
	}
	delete[] dx;
	delete[] dy;
	cout << cnt << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	