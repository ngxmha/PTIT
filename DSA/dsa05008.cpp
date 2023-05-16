#include<iostream>
using namespace std;

int n, S;

void solve(int a[], int n){
	bool dp[S + 1] = {false};
	dp[0] = true;
	for(int i = 0; i < n; i++){
		for(int t = S; t >= a[i]; t--){
			if(dp[t - a[i]]){
				dp[t] = true;
			}
		}
	}
	if(dp[S])
		cout << "YES\n";
	else
		cout << "NO\n";
}

void testcase(){
	cin >> n >> S;
	int a[n];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	solve(a, n);
}

int main(){
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}