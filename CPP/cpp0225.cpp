#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int a[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++)
				cin >> a[i][j];
		}
		int max1 = INT_MIN;
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < n; j++){
				sum += a[i][j];
			}
			max1 = max(max1 , sum);
		}
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < n; j++){
				sum += a[j][i];
			}
			max1 = max(max1, sum);
		}
		int res = 0;
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < n; j++){
				sum += a[i][j];
			}
			res += max1 - sum;
		}
		cout << res << endl;
	}
}