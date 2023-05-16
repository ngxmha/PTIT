#include<iostream>
#include<string.h>
using namespace std;

void testcase(){
	int n, V;
	cin >> n >> V;
	int w[n], v[n];
	for(int i = 1; i <= n; i++){
		cin >> w[i];
	}
	for(int i = 1; i <= n; i++){
		cin >> v[i];
	}
	int dp[n + 1][V + 1];
	memset(dp, 0, sizeof(dp));
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= V; j++){
			dp[i][j] = dp[i - 1][j];
			if(w[i] <= j){
				dp[i][j] = max(dp[i][j], dp[i - 1][j - w[i]] + v[i]);
			}
		}
	}
	cout << dp[n][V] << endl;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
	}
}