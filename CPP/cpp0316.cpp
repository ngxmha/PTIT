#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		string s;
		cin >> s;
		while(s.size() != 1){
			int res = 0;
			for(int i = 0; i < s.size(); i++){
				res += s[i] - '0';
			}
			s = to_string(res);
		}
		if(s == "9") 
			cout << "1";
		else 
			cout << "0";
		cout << endl;
	}
}