#include<iostream>
using namespace std;
#define ll long long

const int mod = 1e9 + 7;
int n, k;
ll C[1001][1001];

void solve(){
	cin >> n >> k;
	for(int i = 0; i <= n; i++){
		for(int j = 0; j <= i; j++){
			if(j == 0 || j == i)
				C[i][j] = 1;
			else 
				C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % mod;
		}
	}
	cout << C[n][k] << endl;
}


int main(){
//	freopen("Inputc++.txt", "r", stdin);
	int t;	cin >> t;
	while(t--){
		solve();
	}
}



	
