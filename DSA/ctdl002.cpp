#include<bits/stdc++.h>

using namespace std;

int n, k, ok = 1;

void next(int b[]){
	int i = n; 
	while(i >= 1 && b[i] == 1){
		b[i] = 0;
		i--;
	}
	if(i == 0)
		ok = 0;
	else
		b[i] = 1;
}

int main(){
	cin >> n >> k;
	int a[n+1], b[n+1];
	for(int i = 1; i <= n; i++)
		b[i] = 0;
	for(int i = 1; i <= n; i++)
		cin >> a[i];
	int cnt = 0;
	while(ok){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			if(b[i]){
				sum += a[i];
			}
		}
		if(sum == k){
			for(int i = 1; i <= n; i++){
				if(b[i])
					cout << a[i] << " ";
			}
			cout << endl;
			cnt++;
		}
		next(b);
	}
	cout << cnt;
}