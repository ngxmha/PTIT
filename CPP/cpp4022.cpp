#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int cnt = 0;
		for(int i = 0; i < n; i++){
			long long x;
			cin >> x;
			if(x == 0)
				cnt++;
			else
				 cout << x << " "; 
		}
		for(int i = 0; i < cnt ; i++){
			cout << "0 ";
		}
		cout << endl;
	}
}