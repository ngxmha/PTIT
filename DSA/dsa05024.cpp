#include<iostream>
#include<string.h>
using namespace std;

int M = 1e9+7, a[1005], n, k , f[1005];

int tinh(){
	int i, j;
	memset(f, 0, sizeof(f));
	f[0] = 1;
	for(i = 1; i <= k; i++){
		for(j = 1; j <= n; j++){
			if(a[j] <= i)
				f[i] = (f[i] + f[i - a[j]])%M;
		}
	}
	return f[k];
}

int main(){
	int t, i;
	cin >> t;
	while(t--){
		cin >> n >> k;
		for(i = 1; i <= n; i++)
			cin >> a[i];
		cout << tinh();
		cout << endl;
	}
}
