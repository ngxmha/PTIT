#include<iostream>
#include<algorithm>
using namespace std;
#define ll long long

bool test(){
	int n;
	cin >> n;
	ll a[n];
	for(int i = 0; i < n; i++){
		int x;
		cin >> x;
		a[i] = (ll)x * x;
	}
	sort(a, a+n);
	for(int i = n-2; i >= 2; i--){
		int l = 0, r = i-1;
		while(l < r){
			if(a[l] + a[r] == a[i])
				return true;
			else if(a[l] + a[r] < a[i])
				l++;
			else
				r--;
		}
	}
	return false;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		if(test())
			cout << "YES\n";
		else 
			cout << "NO\n";
	}
}