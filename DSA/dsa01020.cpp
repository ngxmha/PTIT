#include<bits/stdc++.h>
using namespace std;

string s;

void pre(){
	int i = s.length() - 1;
	while(i >= 0 && s[i] == '0'){
		s[i] = '1';
		i--;
	}
	if(i != -1)
		s[i] = '0';
}

int main(){
	int t;
	cin >> t;
	while(t--){
		cin >> s;
		pre();
		cout << s << endl;
	}
}