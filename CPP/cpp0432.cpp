#include<bits/stdc++.h>

using namespace std;

bool cmp(int a, int b){
	string s1 = to_string(a);
	string s2 = to_string(b);
	return s1 + s2 > s2 + s1;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int a[n];
		for(int &x : a){
			cin >> x;
		}  
		sort(a, a+n, cmp);
		for(int x:a)
			cout << x;
		cout << endl;
	}
}
