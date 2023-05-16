#include<bits/stdc++.h>

using namespace std;

int n,x[1001];

void next(){
	int i = n - 1;
	while(i >= 1 && x[i] > x[i+1]){
		i--;
	}
	if(i == 0){
		for(int i = 1; i <= n; i++){
			x[i] = i;
		}
	}
	else {
		int j = n;
		while(x[i] > x[j]){
			j--;
		}
		swap(x[i], x[j]);
		reverse(x + i + 1, x + n);
	}
	for(int i = 1; i <= n; i++){
		cout << x[i] << " ";
	}
	cout << endl;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n;
		for(int i = 1; i <= n; i++){
			cin >> x[i];
		}
		next();
	}
}