#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int a[n];
		for(int i = 0; i < n; i++){
			cin >> a[i];
		}
		int res = INT_MIN;
		int check = 0;
		int min_value = a[0];
		for(int i = 1; i < n; i++){	
			if(a[i] > min_value){
				check = 1;
				res = max(res,a[i] - min_value);
			}
			min_value = min(a[i],min_value);
		}
		if(check)
			cout << res << endl;
		else 
			cout << "-1" << endl;
	}
}