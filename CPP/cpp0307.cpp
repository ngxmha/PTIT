#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	cin.ignore();
	while(t--){
		string s1, s2;
		getline(cin, s1);
		getline(cin, s2);
		set<string> se;
		stringstream ss(s1);
		string token1;
		while(ss >> token1){
			se.insert(token1);
		}
		stringstream ss2(s2);
		string token2;
		while(ss2 >> token2){
			if(se.find(token2) != se.end())
				se.erase(token2);
		}
		for(string x : se){
			cout << x << " ";
		}
		cout << endl;
	}
}