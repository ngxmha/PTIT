#include<iostream>
#include<string.h>
using namespace std;

int f[1001][1001];

int qhd(string s){
	int n = s.size(), ans = -1e9, i, j;
	memset(f, false, sizeof(f));
	for(int i = n-1; i >= 0; i--){
		for(int j = i; j <= n-1; j++){
			if(i == j)
				f[i][j] = true;
			else if(s[i] == s[j]){
				if(j - i == 1)
					f[i][j] = true;
				else
					f[i][j] = f[i+1][j-1];
			}
			if(f[i][j])
				ans = max(ans, j - i +1);
		}
	}
	return ans;
}

void testcase(){
	string s;
	cin >> s;
	cout << qhd(s) << endl;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
	}
}