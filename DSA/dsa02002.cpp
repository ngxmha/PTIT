#include<iostream>
using namespace std;

void back_track(int a[], int n){
	if(n == 0)
		return;
	int b[n];
	for(int i = 0; i < n; i++){
		b[i] = a[i];
	}
	for(int i = 0; i < n-1; i++){
		a[i] = a[i] + a[i+1];
	}
	back_track(a, n-1);
	cout << "[";
	for(int i = 0; i < n-1; i++){
		cout << b[i] << " ";
	}
	cout << b[n-1] << "] ";
}

void testcase(){
	int n;
	cin >> n;
	int a[n];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	back_track(a, n);
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
		cout << endl;
	}
}