#include<bits/stdc++.h>

using namespace std;

void Chuanhoa(string &s){
	s[0] = toupper(s[0]);
	for(int i = 1; i < s.size(); i++){
		s[i] = tolower(s[i]);
	}
}

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		cin.ignore();
		string s;
		getline(cin,s);
		vector<string> v;
		stringstream ss(s);
		string word;
		while(ss >> word){
			Chuanhoa(word);
			v.push_back(word);
		}
		if(n == 1){
			cout << v[v.size() - 1] << " ";
			for(int i = 0; i < v.size() - 1; i++){
				cout << v[i];
				if(i != v.size() - 2)
					cout << " ";
			}
		}
		if(n == 2){
			for(int i = 1; i < v.size(); i++){
				cout << v[i] << " ";
			}
			cout << v[0];
		}
		cout << endl;
	}
}