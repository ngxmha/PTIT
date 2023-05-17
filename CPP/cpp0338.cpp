#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		string s;
		cin >> s;
		int k;
		cin >> k;
		int res = 0;
		for(int i = 0; i < s.size(); i++){
			set<char> se;
			for(int j = i; j < s.size(); j++){
				se.insert(s[j]);
				if(se.size() == k)
					res++;
				if(se.size() > k)
					break;
			}
		}
		cout << res << endl;
	}
}