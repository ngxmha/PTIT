#include<bits/stdc++.h>

using namespace std;

int main(){
	ifstream file("DATA.in");
	// ofstream file2("PTIT.out");
	int a;
	map<int,int> mp;
	while(file >> a){
		mp[a]++;
//		file2 << s << endl;
	}
	for(auto x : mp){
		cout << x.first << " " << x.second;
		cout << endl;
	}
} 