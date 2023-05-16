#include<bits/stdc++.h>
using namespace std;

int n, x;

struct phantu{
	int value, pos;
};

bool cmp(phantu a, phantu b){
	if(abs(a.value - x) != abs(b.value - x))
		return abs(a.value - x) < abs(b.value - x);
	return a.pos < b.pos;
}

main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n >> x;
		phantu a[n];
		for(int i = 0; i < n; i++){
			cin >> a[i].value;
			a[i].pos = i;
		}
		sort(a, a + n, cmp);
		for(auto x : a)
			cout << x.value << " ";
		cout << endl;
	}
}