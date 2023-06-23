#include<iostream>
#include<limits.h>
using namespace std;

int N;
int a[101];

void input(){
	cin >> N;
	for(int i = 0; i < N; i++){
		cin >> a[i];
	}
}

void solve(){
	int sum = 0, opt = INT_MIN;
	for(int i = 0; i < N; i++){
		sum += a[i];
		if(sum < 0)
			sum = 0;
		opt = max(sum, opt);
	}
	cout << opt << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		solve();
	}
}
