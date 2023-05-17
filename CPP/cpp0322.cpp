#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		string s1, s2;
		cin >> s1 >> s2;
		while(s1.size() < s2.size())
			s1 = "0" + s1;
		while(s2.size() < s1.size())
			s2 = "0" + s2;
		string res = "";
		int nho = 0;
		for(int i = s1.size() - 1; i >= 0; i--){
			int m = s1[i] - '0' + s2[i] - '0' + nho;
			if(m >= 10){
				res = to_string(m%10) + res;
				nho = 1;
			}
			else{
				res = to_string(m) + res;
				nho = 0;
			}
		}
		if(nho == 1)
			res = "1" + res;
		cout << res << endl;
	}
}