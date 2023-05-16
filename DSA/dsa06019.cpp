#include<bits/stdc++.h>
using namespace std;

int b[10001];

bool cmp(int a, int c){
	if(b[a] == b[c])
		return a < c;
	return b[a] > b[c];
}

main(){
	int t;
	cin >> t;
	vector<int> v;
	while(t--){
		int n;
		cin >> n;
		for(int i = 0; i < n; i++){
			int x;
			cin >> x;
			v.push_back(x);
			b[x]++;
		}
		sort(v.begin(), v.end(), cmp);
		for(auto x : v)
			cout << x << " ";
		v.clear();
		memset(b,0,sizeof(b));
		cout << endl;
	}
}