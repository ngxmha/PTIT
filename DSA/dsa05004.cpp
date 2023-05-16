#include<iostream>
#include<algorithm>
using namespace std;

void solve(int a[], int n){
	int dp[n];
	for(int i = 0; i < n; i++){
		dp[i] = 1;
		for(int j = 0; j < i; j++){
			if(a[i] > a[j]){
				dp[i] = max(dp[i], dp[j] + 1);
			}
		}
	}
	cout << *max_element(dp, dp + n);
}

void testcase(){
	int n; cin >> n;
	int a[n];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	solve(a, n);
}

int main(){
	testcase();
}