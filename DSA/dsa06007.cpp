#include<bits/stdc++.h>
using namespace std;

main(){
	int t;
	cin >> t;
	while(t--){
		// int n;
		// cin >> n;
		// int a[n], b[n];
		// for(int i = 0; i < n; i++){
		// 	cin >> a[i];
		// 	b[i] = a[i];
		// }
		// sort(a, a + n);	
		// int l = 0, r = n - 1;
		// while(l < n){
		// 	if(a[l] != b[l])
		// 		break;
		// 	l++;
		// }
		// while(r >= 0){
		// 	if(a[r] != b[r])
		// 		break;
		// 	r--;
		// }
		// cout << l + 1 << " " << r + 1;
		// cout << endl;
		int n;
		cin >> n;
		int a[n];
		for(int &x : a)
			cin >> x;
		int l = 0, r = n - 1;
		while(l < n - 1){
			if(a[l] > a[l+1])
				break;
			l++;
		}
		while(r > 0){
			if(a[r] < a[r-1])
				break;
			r--;
		}
		int min_temp = *min_element(a + l, a + r + 1);
		int max_temp = *max_element(a + l, a + r + 1);
		for(int i = 0; i <= l; i++){
			if(a[i] > min_temp){
				l = i;
				break;
			}
		}
		for(int i = n - 1; i >= r; i--){
			if(a[i] < max_temp){
				r = i;
				break;
			}
		}
		cout << l+1 << " " << r+1 << endl;
	}
}