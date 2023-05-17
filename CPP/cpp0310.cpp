#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		string s1,s2;
		cin >> s1 >> s2;
		long long res_min = INT_MAX, res_max = INT_MIN;
		for(int i = 0; i < s1.size(); i++){
			if(s1[i] == '5')
				s1[i] = '6';
		}
		for(int i = 0; i < s2.size(); i++){
			if(s2[i] == '5')
				s2[i] = '6';
		}
		long long a = stoll(s1), b = stoll(s2);
		res_max = a + b;
		for(int i = 0; i < s1.size(); i++){
			if(s1[i] == '6')
				s1[i] = '5';
		}
		for(int i = 0; i < s2.size(); i++){
			if(s2[i] == '6')
				s2[i] = '5';
		}
		a = stoll(s1); b = stoll(s2);
		res_min = a + b;
		cout << res_min << " " << res_max << endl;
 	}
}