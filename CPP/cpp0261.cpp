#include<bits/stdc++.h>

using namespace std;

int main(){
	int n;
	cin >> n;
	int a[n][n];//,c[n][n];
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			cin >> a[i][j];
			// c[i][j] = a[i][j];
		}
	}
	int m;
	cin >> m;
	int b[m][m];
	for(int i = 0; i < m; i++){
		for(int j = 0; j < m; j++)
			cin >> b[i][j];
	}
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			int i1 = i, j1 = j;
			if(i1 >= m)
				i1 %= m;
			if(j1 >= m)
				j1 %= m;
			//c[i][j] = a[i][j] * b[i1][j1]; 
			a[i][j] *= b[i1][j1];
		}
	}
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			cout << a[i][j];
			if(j != n - 1) 
				cout << " ";
		}
		cout << endl;
	}
}