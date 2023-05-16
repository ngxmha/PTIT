#include<iostream>
using namespace std;

int a[10] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

void testcase(){
	int n;
	cin >> n;
	int cnt = 0;
	for(int i = 9; i >= 0; i--){
		while(a[i] <= n){
			cnt++;
			n -= a[i];
			if(n == 0){
				cout << cnt;
				return;
			}
		}
	}
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
		cout << endl;
	}
}