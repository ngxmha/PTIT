#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		string s;
		cin >> s;
		long long res = 1;
		long long sum = 0;
		if(s[s.size()-1] == '1')
			sum += 1; 
		for(int i = s.size() - 2; i >= 0; i--){	
			res *= 2;
			res %= 5;
			if(s[i] == '1'){
				sum += res;
				sum %= 5;
			}
		}
		if(sum)
			cout << "No";
		else
			cout << "Yes";
		cout << endl;
	}
}