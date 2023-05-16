#include<bits/stdc++.h>

using namespace std;

int n, x[11], ok = 1;

void begin(){
	for(int i = 1; i <= n; i++){
		x[i] = i;
	}
}

void next(){
	int i = n - 1;
	while(i >= 1 && x[i] > x[i+1]){
		i--;
	}
	if(i == 0){
		ok = 0;
	}
	else {
		int j = n;
		while(x[i] > x[j]){
			j--;
		}
		swap(x[i], x[j]);
		reverse(x + i + 1, x + n + 1);
		// int l = i+1, r = n;
		// while(l < r){
		// 	swap(x[l], x[r]);
		// 	l++; r--;
		// }
	}
}

int main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n;
		begin();
		while(ok){
			for(int i = 1; i <= n; i++){
				cout << x[i];
			}
			cout << " ";
			next();
		}
		cout << endl;
		ok = 1;
	}
}

