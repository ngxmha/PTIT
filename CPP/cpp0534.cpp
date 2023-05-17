#include<bits/stdc++.h>

using namespace std;

bool check(string s){
	if(s.size() < 2) 
		return false;
	string t = s;
	reverse(s.begin(),s.end());
	return t == s;
}

bool cmp(pair<string, int> a, pair<string, int> b){
	if(a.first.size() != b.first.size())
		return a.first.size() > b.first.size();
	return a.first > b.first;
}

int main(){
	string s;
	map<string,int> mp;
	while(cin >> s){
		if(check(s))
			mp[s]++;
	}
	vector<pair<string,int>> v;
	for(pair<string, int> x : mp){
		v.push_back(x);
	}
	sort(v.begin(), v.end(), cmp);
	for(pair<string, int> x : v){
		cout << x.first << " " << x.second << endl;
	}
}