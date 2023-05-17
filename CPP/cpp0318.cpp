#include<bits/stdc++.h>

using namespace std;

bool inc(string s){
	for(int i = 0; i < 4; i++){
		if(s[i] >= s[i + 1]) 
			return false;
	}
	return true;
}

bool equal(string s){
	if(s[0] != s[1] || s[1] != s[2] || s[2] != s[3] || s[3] != s[4])
		return false;
	return true;
}

bool equal2(string s){
	if(s[0] == s[1] && s[1] == s[2] && s[3] == s[4])
		return true;
	return false;
}

bool solve(string s){
	for(int i = 0; i < 4; i++){
		if(s[i] != '6' && s[i] != '8')
			return false;
	}
	return true;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		string s;
		cin >> s;
		string s1 = s.substr(5);
		s1.erase(3,1);
		if(inc(s1) || equal(s1) || equal2(s1) || solve(s1))
			cout << "YES";
		else 
			cout << "NO";
		cout << endl;
	}
}