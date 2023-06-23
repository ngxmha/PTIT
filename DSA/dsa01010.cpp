#include<iostream>
#include<string.h>
using namespace std;

int N, K, x[41], used[41];
bool ok;

void next(){
	int i = K;
	while(x[i] == N - K + i){
		i--;
	}
	if(i == 0)
		ok = false;
	else {
		x[i]++;
		for(int j = i + 1; j <= K; j++){
			x[j] = x[j - 1] + 1;
		}
	}
}

void solve(){
	cin >> N >> K;
	memset(used, false, sizeof(used));
	int res = 0;
	ok = true;
	for(int i = 1; i <= K; i++){
		cin >> x[i];
		used[x[i]] = true;
	}
	next();
	if(!ok){
		cout << K << endl;
		return;
	}
	for(int i = 1; i <= K; i++){
		if(!used[x[i]])
			res++;
	}
	cout << res << endl;
}


int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;
	cin >> t;
	while(t--){
		solve();
	}
}

