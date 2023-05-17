#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		string s1, s2;
		cin >> s1 >> s2;
		if(s1.size() < s2.size())
			swap(s1, s2);
		else if(s1.size() == s2.size()){
			if(s1 < s2)
				swap(s1, s2);
		}
		while(s2.size() < s1.size())
			s2 = "0" + s2;
		string res = "";
		int nho = 0;
		for(int i = s1.size() - 1; i >= 0; i--){
			if(s1[i] - '0' < s2[i] - '0' + nho){
				res = to_string(10 + (s1[i] - '0') - (s2[i] - '0') - nho) + res;
				nho = 1;
			}
			else{
				res = to_string((s1[i] - '0') - (s2[i] - '0') - nho) + res;
				nho = 0;
			}
		}
		cout << res << endl;
	}
}