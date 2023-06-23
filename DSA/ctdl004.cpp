#include<iostream>
using namespace std;

int N, K, x[101], a[101], cnt;

bool check(){
	for(int i = 2; i <= K; i++){
		if(a[x[i]] < a[x[i - 1]])
			return false;
	}
	return true;
}

void Try(int i){
	for(int j = x[i-1] + 1; j <= N - K + i; j++){
		x[i] = j;
		if(i == K){
			if(check())
				cnt++;
		}
		else {
			Try(i+1);
		}
	}
}

void solve(){
	cin >> N >> K;
	for(int i = 1; i <= N; i++){
		cin >> a[i];
	}
	Try(1);
	cout << cnt;
}


int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t = 1;
	// cin >> t;
	while(t--){
		solve();
	}
}

