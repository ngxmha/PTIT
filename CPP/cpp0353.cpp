#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		string s, s1 = "";
		cin >> s;
		for(int i = 0; i < s.size(); i++){
			if((s[i] >= 'A' && s[i] <= 'C') || (s[i] >= 'a' && s[i] <= 'c'))
				s1 += '2';
			else if((s[i] >= 'D' && s[i] <= 'F') || (s[i] >= 'd' && s[i] <= 'f'))
				s1 += '3';
			else if((s[i] >= 'G' && s[i] <= 'I') || (s[i] >= 'g' && s[i] <= 'i'))
				s1 += '4';
			else if((s[i] >= 'J' && s[i] <= 'L') || (s[i] >= 'j' && s[i] <= 'l'))
				s1 += '5';
			else if((s[i] >= 'M' && s[i] <= 'O') || (s[i] >= 'm' && s[i] <= 'o'))
				s1 += '6';
			else if((s[i] >= 'P' && s[i] <= 'S') || (s[i] >= 'p' && s[i] <= 's'))
				s1 += '7';
			else if((s[i] >= 'T' && s[i] <= 'V') || (s[i] >= 't' && s[i] <= 'v'))
				s1 += '8';
			else if((s[i] >= 'W' && s[i] <= 'Z') || (s[i] >= 'w' && s[i] <= 'z'))
				s1 += '9';
		}
		int ok = 1;
		int l = 0, r = s1.size() - 1;
		while(l < r){
			if(s1[l] != s1[r]){
				ok = 0;
				break;
			}
			l++; r--;
		}
		if(ok)
			cout << "YES";
		else 
			cout << "NO";
		cout << endl;
	}
}