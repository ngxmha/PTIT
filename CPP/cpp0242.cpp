#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int a[n], b[n];
		for(int i = 0; i < n; i++){
			cin >> a[i];
		}
		for(int i = 0; i < n; i++)
			cin >> b[i];
		int res = INT_MIN;
		for(int i = 0; i < n; i++){
			int cnt = 0;
			int suma = 0, sumb = 0;
			for(int j = i; j < n; j++){
				suma += a[j];
				sumb += b[j];
				// cnt++;
				if(suma == sumb){
					res = max(j-i+1, res);
				}
			}
		}
		cout << res << endl;
	}
}