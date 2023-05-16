#include<bits/stdc++.h>
using namespace std;

int n, a[11], ok = 1;

void next(){
	int i = n; 
	while(i >= 1 && a[i] == 1){
		a[i] = 0;
		i--;
	}
	if(i == 0)
		ok = 0;
	else 
		a[i] = 1;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n;
		while(ok){
			for(int i = 1; i <= n; i++){
				if(!a[i])
					cout << "A";
				else 
					cout << "B";
			}
			cout << " ";
			next();
		}
		ok = 1;
		cout << endl;
	}
}
