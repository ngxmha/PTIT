#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		string s;
		cin >> s;
		int sum = 0;
		for(int i = 0; i < s.size(); i++){
			if(s[i] >= '0' && s[i] <= '9'){
				int m = 0;
				while(s[i] >= '0' && s[i] <= '9'){
					m = m * 10 + s[i] - '0';
					i++;
				}
				sum += m;
			}
		}
		cout << sum << endl;
	}
}