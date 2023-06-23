#include<iostream>
using namespace std;
#define ll long long

int N, S, M;

void solve(){
	cin >> N >> S >> M;
	if(N < M || S * M > (S - S / 7) * N){
		cout << "-1\n";
		return;
	}
	if((float)S * M / N == S * M / N)
		cout << S * M / N << endl;
	else
		cout << S * M / N + 1 << endl;
}

int main(){
//	freopen("Inputc++.txt", "r", stdin);
	int t;	cin >> t;
	while(t--){
		solve();
	}
}



	
