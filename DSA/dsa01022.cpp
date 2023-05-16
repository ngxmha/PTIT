#include<bits/stdc++.h>
using namespace std;

int n, a[10], b[10], ok = 1;

void begin(){
	for(int i = 1; i <= n; i++)
		a[i] = i;
}

void next(){
	int i = n-1;
	while(i >= 1 && a[i] > a[i+1])
		i--;
	if(i == 0)
		ok = 0;
	else {
		int j = n;
		while(a[i] > a[j])
			j--;
		swap(a[i], a[j]);
		reverse(a+i+1, a+n+1);
	}
}

int check(){
	for(int i = 1; i <= n; i++){
		if(a[i] != b[i])
			return false;
	}
	return true;
}

main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n;
		begin();
		for(int i = 1; i <= n; i++)
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
