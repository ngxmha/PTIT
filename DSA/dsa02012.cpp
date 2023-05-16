#include<iostream>
using namespace std;

int n, m, a[101][101];
int cnt;
void back_track(int i, int j){
	if(i == n && j == m){
		cnt++;
		return;
	}
	if(i < n)
		back_track(i + 1, j);
	if(j < m)
		back_track(i, j + 1);
}

void testcase(){
	cin >> n >> m;
	cnt = 0;
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= m; j++){
			cin >> a[i][j];
		}
	}
	back_track(1, 1);
	cout << cnt;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
		cout << endl;
	}
}