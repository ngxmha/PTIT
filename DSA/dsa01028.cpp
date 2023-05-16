#include<bits/stdc++.h>
using namespace std;

int m, n, k, a[21], ok = 1;

void begin(){
	for(int i = 1; i <= k; i++){
		a[i] = i;
	}
}

void next(){
	int i = k;
	while(i >= 1 && a[i] == n-k+i)
		i--;
	if(i == 0)
		ok = 0;
	else {
		a[i]++;
		for(int j = i + 1; j <= k; j++)
			a[j] = a[j-1] + 1;
	}
}

int main(){
	cin >> m >> k;
	set<int> se;
	vector<int> v;
	for(int i = 1; i <= m; i++){
		int x;
		cin >> x;
		se.insert(x);
	}
	for(set<int> :: iterator it = se.begin(); it != se.end(); it++){
		v.push_back(*it);
	}
	n = v.size();
	begin();
	while(ok){
		for(int i = 1; i <= k; i++){
			cout << v[a[i]-1] << " ";
		}
		cout << endl;
		next();
	}
}