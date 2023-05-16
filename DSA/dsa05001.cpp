#include<iostream>
#include<string.h>
using namespace std;

string s1, s2;
int n, m, dp[1001][1001];

void solve(){
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= m; j++){
			if(s1[i - 1] == s2[j - 1]){
				dp[i][j] = dp[i - 1][j - 1] + 1;
			}
			else {
				dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
	}
	cout << dp[n][m] << endl;
}

void testcase(){
	cin >> s1 >> s2;
	n = s1.size(), m = s2.size();
	memset(dp, 0, sizeof(dp));
	solve();
}

int main(){
	int t; cin >> t;
	while(t--){
		testcase();
	}
}