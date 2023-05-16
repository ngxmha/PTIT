#include<bits/stdc++.h>
using namespace std;

void test(){
	int n;
	cin >> n;
	map<int,int> ma;
	for(int i = 0; i < n; i++){
		int x;
		cin >> x;
		ma[x]++;
	} 
	for(auto x : ma){
		if(x.second > n/2){
			cout << x.first;
			return;
		}
	}
	cout << "NO";
}

int main(){
	int t; 
	cin >> t;
	while(t--){
		test();
		cout << endl;
	}
}