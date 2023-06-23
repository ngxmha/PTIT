#include<iostream>
#include<math.h>
using namespace std;
#define ll long long

int n;
int k;

void input(){
	cin >> n >> k;
}

int power(int n){
	if(n == 0) 
		return 1;
	int p = power(n / 2);
	if(n % 2 == 0)
		return p * p;
	return 2 * p * p;
}

int solve(int n, int k){
	if(k == 1)
		return 1;
	int tmp = power(n - 1);
	if(k == tmp)
		return n;
	if(k < tmp)
		return solve(n - 1, k);
	return solve(n - 1, k - tmp);
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		cout << char(solve(n, k) + 64) << endl;
	}
}
