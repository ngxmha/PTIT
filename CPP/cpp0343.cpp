#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	cin.ignore();
	while(t--){
		string s;
		getline(cin, s);
		stringstream ss(s);
		string token;
		int chan = 0, le = 0, cnt = 0;
		while(ss >> token){
			cnt++;
			int a = stoi(token);
			if(a % 2 == 0)
				chan++;
			else
				le++;
		}
		if((cnt % 2 == 0 && chan > le) || (cnt % 2 == 1 && le > chan))
			cout << "YES\n";
		else 
			cout << "NO\n";
	}
}