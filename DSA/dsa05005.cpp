#include<iostream>
#include<algorithm>
using namespace std;

void testcase(){
	int n; cin >> n;
	int a[n];
	int dp[n];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	for(int i = 0; i < n; i++){
		dp[i] = 1;
		for(int j = 0; j < i; j++){
			if(a[i] > a[j]){
				dp[i] = max(dp[i], dp[j] + 1);
			}
		}
	}
	cout << n - *max_element(dp, dp + n) << endl;
}

int main(){
	int t; cin >> t;
	while(t--){
		testcase();
	}
}
