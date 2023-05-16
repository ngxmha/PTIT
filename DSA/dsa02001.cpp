#include<iostream>
using namespace std;

void back_track(int a[], int n){
	if(n == 0)
		return;
	cout << "[";
	for(int i = 0; i < n-1; i++){
		cout << a[i] << " ";
	}
	cout << a[n-1] << "]" << endl;
	for(int i = 0; i < n-1; i++){
		a[i] = a[i] + a[i+1];
	}
	back_track(a, n-1);
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
	}
}