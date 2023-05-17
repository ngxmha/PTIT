#include<bits/stdc++.h>

using namespace std;

int main(){
	int n;
	cin >> n;
	while(n--){
		string s;
		cin >> s;
		set<char> se;
		int check = 1;
		for(int i = 0; i < s.size(); i++){
			if(s[i] < '0' || s[i] > '9' || s[0] == '0'){
				check = 0;
				break;
			}
			else 
				se.insert(s[i]);
		}
		if(!check)
			cout << "INVALID";
		else {
			if(se.size() == 10)
				cout << "YES";
			else 
				cout << "NO";
		}
		cout << endl;
	}
}