#include<iostream>
using namespace std;

void testcase(){
	int n;
	cin >> n;
	bool adjMatrix[n + 1][n + 1];
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= n; j++){
			cin >> adjMatrix[i][j];
		}
	}
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= n; j++){
			if(adjMatrix[i][j])
				cout << j << " ";
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
