#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		string s;
		cin >> s;
		int check = 1;
		int i = s.size() - 2;
		while(i >= 0 && s[i] <= s[i+1])
			i--;
		if(i == -1)
			check = 0;
		else{
			int j = s.size() - 1;
			while(s[j] >= s[i])
				j--;
			while(s[j] < s[i] && s[j] == s[j-1])
				j--;
			swap(s[i], s[j]); 
		}
		if(s[0] == '0')
			check = 0;
		if(check) 
			cout << s;
		else 
			cout << "-1";
		cout << endl;
	}
}