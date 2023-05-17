#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		string s;
		cin >> s;
		map<char, int> mp;
		for(int i = 0; i < s.size(); i++){
			mp[s[i]]++;
		}
		int max_fre = INT_MIN;
		for(auto x : mp){
			max_fre = max(max_fre, x.second);
		} 
		if(max_fre - 1 <= s.size() - max_fre)
			cout << "1" << endl;
		else			
			cout << "0" << endl;
	}
}