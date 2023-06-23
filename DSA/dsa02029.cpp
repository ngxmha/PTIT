#include<iostream>
using namespace std;
#define ll long long

int N;

void HNtower(int n, char a, char b, char c){
	if(n == 1){
		cout << a << " -> " << c << endl;
		return;
	}
	HNtower(n - 1, a, c, b);
	HNtower(1, a, b, c);
	HNtower(n - 1, b, a, c);
}

int main(){
//	freopen("Inputc++.txt", "r", stdin);
	int t = 1;	//cin >> t;
	while(t--){
		cin >> N;
		HNtower(N, 'A', 'B', 'C');
	}
}



	
