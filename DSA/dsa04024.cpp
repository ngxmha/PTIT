#include<iostream>
using namespace std;
#define ll long long

struct Matrix{
	ll a[11][11] = {};
	
	Matrix(){
	}
	
	Matrix(int n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j)
					a[i][j] = 1;
				else 
					a[i][j] = 0;
			}
		}
	}
};

const int mod = 1e9 + 7;
int N, K;
Matrix M;

void input(){
	cin >> N >> K;
	for(int i = 0; i < N; i++){
		for(int j = 0; j < N; j++){
			cin >> M.a[i][j];
		}
	}
}

Matrix Multi(Matrix A, Matrix B){
	Matrix C;
	for(int i = 0; i < N; i++){
		for(int j = 0; j < N; j++){
			for(int k = 0; k < N; k++){
				C.a[i][j] += ((A.a[i][k] % mod) * (B.a[k][j] % mod)) % mod;
			}
		}
	}
	return C;
}

Matrix power(Matrix A, int k){
	if(k == 0)
		return Matrix(N);
	Matrix m = power(A, k / 2);
	if(k % 2 == 0)
		return Multi(m, m);
	return Multi(A, Multi(m, m));
}

void solve(){
	Matrix p = power(M, K);
	ll res = 0;
	for(int i = 0; i < N; i++){
		res += p.a[i][N - 1] % mod;
	}
	cout << res % mod << endl;
}

int main(){
//	freopen("Inputc++.txt", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		solve();
	}
}

	
