#include<iostream>
#include<sstream>
using namespace std;

void testcase(){
	int n;
	cin >> n;
	cin.ignore();
	for(int i = 1; i <= n; i++){
		string s;
		getline(cin, s);
		stringstream ss(s);
		string tmp;
		while(ss >> tmp){
			int u = stoi(tmp);
			if(i < u)
				cout << i << " " << u << endl;
		}
	}
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t = 1;	//cin >> t;
	while(t--){
		testcase();
	}
}
