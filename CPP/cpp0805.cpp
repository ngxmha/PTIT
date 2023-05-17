#include<bits/stdc++.h>

using namespace std;

void chuanhoa(string &s){
	for(int i = 0; i < s.size(); i++){
		s[i] = tolower(s[i]);
	}
}

int main(){
	ifstream file("DATA1.in");
	ifstream file2("DATA2.in");
	// ofstream file2("PTIT.out");
//		file2 << s << endl;
	set<string> se,se1,se2;
	string s;
	while(file >> s){
		chuanhoa(s);
		se.insert(s);
		se1.insert(s);
	}
	while(file2 >> s){
		chuanhoa(s);
		se.insert(s);
		if(se1.find(s) != se1.end())
			se2.insert(s);
	}
	for(auto x : se){
		cout << x << " ";
	}
	cout << endl;
	for(auto x : se2){
		cout << x << " ";
	}
} 