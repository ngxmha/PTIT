#include<bits/stdc++.h>

using namespace std;

// int b[10000001];

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int a[n-1];
		long long sum = 0;
		for(int i = 0; i < n-1; i++){
			cin >> a[i];
			sum += a[i];
		}
			// b[a[i]]++;
		// }
		// for(int i = 1; i <= n; i++){
		// 	if(b[i] == 0){
		// 		cout << i;
		// 		break;
		// 	}
		// }
		// for(int i = 0; i < 10000001; i++){
		// 	b[i] = 0;
		// }
		cout << (long long)n*(n+1)/2 - sum;
		cout << endl;
	}
}
