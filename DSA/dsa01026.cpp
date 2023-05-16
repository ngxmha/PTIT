#include<bits/stdc++.h>
using namespace std;

int n, a[16], ok = 1;

void next(){
	int i = n;
	while(i >= 1 && a[i] == 1){
		a[i] = 0;
		i--;
	}
	if(i == 0)
		ok = 0;
	else 
		a[i]++;
}

bool check(){
	if(a[1] != 1 || a[n] != 0)
		return false;
	for(int i = 1; i <= n-1; i++){
		if(a[i] == 1 && a[i+1] == 1)
			return false; 
	}
	int cnt = 0;
	for(int i = 2; i <= n; i++){
		if(a[i] == 0){
			cnt++;
			if(cnt > 3)
				return false;
		}
		else{
			cnt = 0;
		}
	}
	return true;
}

main(){
	cin >> n;
	while(ok){
		if(check()){
			for(int i = 1; i <= n; i++){
				if(a[i]) 
					cout << "8";
				else 
					cout << "6";
			}
			cout << endl;
		}
		next();
	}
}