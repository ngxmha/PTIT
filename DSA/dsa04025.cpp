#include<iostream>
using namespace std;
#define ll long long

struct Matrix{
	ll a[2][2] = {};
	
	Matrix(){
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				if(i == 1 && j == 1){
					a[i][j] = 0;
				}
				else 
					a[i][j] = 1;
			}
		}
	}
};

const int mod = 1e9 + 7;
int N;
Matrix M;

Matrix Multi(Matrix A, Matrix B){
	Matrix C;
	for(int i = 0; i < 2; i++){
		for(int j = 0; j < 2; j++){
			C.a[i][j] = 0;
			for(int k = 0; k < 2; k++){
				C.a[i][j] += ((A.a[i][k] % mod) * (B.a[k][j] % mod)) % mod;
			}
		}
	}
	return C;
}

Matrix power(int k){
	if(k == 1)
		return M;
	Matrix m = power(k / 2);
	if(k % 2 == 0)
		return Multi(m, m);
	return Multi(M, Multi(m, m));
}

void solve(){
	cin >> N;
	Matrix p = power(N);
	cout << p.a[0][1] % mod << endl;
}

int main(){
//	freopen("Inputc++.txt", "r", stdin);
	int t;	cin >> t;
	while(t--){
		solve();
	}
}



	
