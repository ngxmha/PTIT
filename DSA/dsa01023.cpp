#include<bits/stdc++.h>
using namespace std;

int n, k, a[15], b[15], ok = 1;

void begin(){
	for(int i = 1; i <= k; i++)
		a[i] = i;
}

void next(){
	int i = k;
	while(i >= 1 && a[i] == n-k+i)
		i--;
	if(i == 0)
		ok = 0;
	else{
		a[i]++;
		for(int j = i+1; j <= k; j++){
			a[j] = a[j-1] + 1;
		}
	}
}

bool check(){
	for(int i = 1; i <= k; i++){
		if(a[i] != b[i])
			return false;
	}
	return true;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n >> k;
		begin();		
		for(int i = 1; i <= k; i++)
			cin >> b[i];
		int cnt = 1;
		while(ok){
			if(check()){
				cout << cnt;
				break;
			}
			next();
			cnt++;
		}
		ok = 1;
		cout << endl;
	}
}
