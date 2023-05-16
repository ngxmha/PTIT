#include<bits/stdc++.h>
using namespace std;

int n, k, a[40], b[40];
set<int> s;

void next(){
	int i = k;
	while(i >= 1 && a[i] == n-k+i)
		i--;
	if(i == 0)
		return;
	else {
		a[i]++;
		for(int j = i + 1; j <= k; j++)
			a[j] = a[j-1] + 1;
	}
}

int main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n >> k;
		for(int i = 1; i <= k; i++){
			cin >> a[i];
			s.insert(a[i]);
		}
		next();
		int cnt = 0;
		for(int i = 1; i <= k; i++){
			if(s.find(a[i]) == s.end())
				cnt++;
		}
		if(cnt)
			cout << cnt;
		else 
			cout << k;
		s.clear();
		for(int i = 1; i <= k; i++){
			a[i] = 0;
		}
		cout << endl;
	}
}