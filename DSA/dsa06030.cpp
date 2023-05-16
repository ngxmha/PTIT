#include<bits/stdc++.h>
using namespace std;

void bubbleSort(int a[], int n, int i){
	if(i == n - 1)
		return;
	int check = 0;
	int b[n];
	for(int j = 0; j < n - i - 1; j++){
		if(a[j] > a[j+1]){
			check = 1;
			swap(a[j], a[j+1]);
		}
	}
	if(check){
		for(int j = 0; j < n; j++){
			b[j] = a[j];
		}
	}
	bubbleSort(a, n, i + 1);
	if(check){
		cout << "Buoc " << i + 1 << ": ";
		for(int j = 0; j < n; j++){
			cout << b[j] << " ";
		}
		cout << endl;


	}
}

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int a[n];
		for(int &x : a)
			cin >> x;
		bubbleSort(a, n, 0);
	}
}