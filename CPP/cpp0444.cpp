#include<bits/stdc++.h>

using namespace std;

// int binary_search(int a[], int n , int x){
// 	int l = 0, r = n-1;
// 	while(l <= r){
// 		int mid = (r+l)/2;
// 		if(a[mid] == x) 
// 			return true;
// 		else if(a[mid] < x)
// 			l = mid + 1;
// 		else 
// 			r = mid - 1;
// 	}
// 	return false;
// }

// int binary_search2(int a[], int l, int r, int x){
// 	if(l>r)
// 		return false;
// 	else{
// 		int m = l + (r -l)/2;
// 		if(a[m] == x) 
// 			return m+1;
// 		else if(a[m] < x)
// 			return binary_search2(a,m+1,r,x);
// 		else 
// 			return binary_search2(a,l,m-1,x);
// 	}
// }

int main(){
	int t;
	cin >> t;
	while(t--){
		int n, x;
		cin >> n >> x;
		vector<int> v;
		for(int i = 0; i < n; i++){
			int m; cin >> m;
			v.push_back(m);
		}
		for(int i = 0; i < n; i++){
			if(v[i] == x){
				cout << i + 1;
				break;
			}
		}
		cout << endl;
	}
}