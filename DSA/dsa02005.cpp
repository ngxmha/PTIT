#include<iostream>
using namespace std;

int n;
char x[11];
bool used[11];
string s;

void out(){
	for(int i = 1; i <= n; i++){
		cout << x[i];
	}
	cout << " ";
}

void Try(int i){
	for(int j = 1; j <= n; j++){
		if(!used[j]){
			x[i] = s[j-1];
			used[j] = true;
			if(i == n){
				out();
			}
			else
				Try(i+1);
			used[j] = false;
		}
	}
}

void testcase(){
	cin >> s;
	n = s.size();
	Try(1);
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
		cout << "\n";
	}
}