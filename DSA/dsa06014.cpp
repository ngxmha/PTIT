#include<bits/stdc++.h>
using namespace std;

bool prime[1000001];

void sang(){
	for(int i = 2; i < 1000001; i++){
		prime[i] = true;
	}
	for(int i = 2; i <= 1000; i++){
		if(prime[i]){
			for(int j = i * i; j < 1000001; j += i){
				prime[j] = false;
			}
		}
	}
}

int main(){
	int t;
	cin >> t;
	sang();
	while(t--){
		int n;
		cin >> n;
		bool check = false;
		for(int i = 2; i <= n/2; i++){
			if(prime[i] && prime[n-i]){
				check = true;
				cout << i << " " << n - i;
				break;
			}
		}
		if(!check)
			cout << "-1";
		cout << endl;
	}
}





