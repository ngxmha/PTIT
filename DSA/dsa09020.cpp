#include<iostream>
#include<sstream>
using namespace std;

void testcase(){
	int n;
	cin >> n;
	cin.ignore();
	bool adjMatrix[n + 1][n + 1] = {0};
	for(int i = 1; i <= n; i++){
		string s;
		getline(cin, s);
		stringstream ss(s);
		string num;
		while(ss >> num){
			adjMatrix[i][stoi(num)] = 1;
		}
	}
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= n; j++){
			cout << adjMatrix[i][j] << " ";
		}
		cout << endl;
	}
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t = 1;	//cin >> t;
	while(t--){
		testcase();
	}
}
	