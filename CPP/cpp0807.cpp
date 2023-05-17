#include<bits/stdc++.h>

using namespace std;

int main(){
	ifstream file("DATA.in");
	// ofstream file2("PTIT.out");
//		file2 << s << endl;
	map<int,int> mp;
	int n,m;
	file >> n >> m;
	for(int i = 0; i < n; i++){
		int x; file >> x;
		mp[x] = 1;
	}
	for(int i = 0; i < m; i++){
		int x; file >> x;
		if(mp[x] != 0)
			mp[x]++;
	}
	for(auto x : mp){
		if(x.second >= 2)
			cout << x.first << " ";
	}
} 