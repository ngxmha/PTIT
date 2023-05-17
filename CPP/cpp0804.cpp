#include<bits/stdc++.h>

using namespace std;

void chuanhoa(string &s){
	for(int i = 0; i < s.size(); i++){
		s[i] = tolower(s[i]);
	}
}

int main(){
	ifstream file("VANBAN.in");
	// ofstream file2("PTIT.out");
	set<string> se;
	string s;
	while(file >> s){
		chuanhoa(s);
		se.insert(s);
//		file2 << s << endl;
	}
	for(auto x : se){
		cout << x;
		cout << endl;
	}
}