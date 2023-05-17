#include<bits/stdc++.h>

using namespace std;

int main(){
	int n, k, b;
	cin >> n >> k >> b;
	int a[n];
	memset(a, 0, sizeof(a));
	int cnt = 0, res;
	while(b--){
		int x;
		cin >> x;
		a[x] = 1;
	}
	for(int i = 0; i < k; i++){
		if(a[i] == 1)
			cnt++;
	}
	res = cnt;
	for(int i = k; i < n; i++){
		if(a[i - k] == 1)
			cnt--;
		if(a[i] == 1)
			cnt++;
		res = min(cnt, res);
	}	
	cout << res << endl;
}
