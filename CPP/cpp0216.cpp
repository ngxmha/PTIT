#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		int n, l, r;
		cin >> n;
		int a[n];
		for(int i = 0; i < n; i++){
			cin >> a[i];
		}
		string s = "";
		cin >> l >> r;
		for(int i = l; i < r; i++){
			if(a[i + 1] > a[i])
				s += "1";
			else if(a[i + 1] < a[i])
				s += "0";
		}
		if(s.find("01") != string::npos)
			cout << "No";
		else 
			cout << "Yes";
		cout << endl;
	}
}