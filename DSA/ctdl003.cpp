#include<iostream>
#include<limits.h>
using namespace std;

int xopt[101], x[101], fopt = INT_MIN, a[101], c[101], N, W;

void check(){
	int s1 = 0, s = 0;
	for(int i = 1; i <= N; i++){
		if(x[i] == 1){
			s1 += a[i];
			s += c[i];
		}
	}
	if(s1 <= W){
		if(s > fopt){
			fopt = s;
			for(int i = 1; i <= N; i++){
				xopt[i] = x[i];
			}
		}
	}
}

void Try(int i){
	for(int j = 0; j <= 1; j++){
		x[i] = j;
		if(i == N)
			check();
		else 
			Try(i + 1);
	}
}

void solve(){
	cin >> N >> W;
	for(int i = 1; i <= N; i++){
		cin >> c[i];
	}
	for(int i = 1; i <= N; i++){
		cin >> a[i];
	}
	Try(1);
	cout << fopt << endl;
	for(int i = 1; i <= N; i++){
		cout << xopt[i] << " ";
	}
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t = 1;	//cin >> t;
	while(t--){
		solve();
	}
}
