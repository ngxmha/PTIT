#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		 string s;
		 cin >> s;
		 vector<char> v;
		 long long sum = 0;
		 for(int i = 0; i < s.size(); i++){
		 	if(s[i] >= 'A' && s[i] <= 'Z')
		 		v.push_back(s[i]);
		 	else 
		 		sum += s[i] - '0';
		}
		sort(v.begin(), v.end());
		for(int i = 0; i < v.size(); i++){
			cout << v[i];
		}
		cout << sum << endl;
	}
}