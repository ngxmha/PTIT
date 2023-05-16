#include<bits/stdc++.h>
using namespace std;

void insertionSort(int a[], int n, int i){
	if(i == n)
		return;
	int b[n];
	int x = a[i], pos = i - 1;
	while(pos >= 0 && x < a[pos]){
		a[pos+1] = a[pos];
		pos--;
	}
	a[pos+1] = x;
	for(int j = 0; j < n; j++){
		b[j] = a[j];
	}
	insertionSort(a, n, i+1);
	cout << "Buoc " << i << ": ";
	for(int j = 0; j <= i; j++){
		cout << b[j] << " ";
	}
	cout << endl;
}

int main(){
	int n;
	cin >> n;
	int a[n];
	for(int &x : a)
		cin >> x;
	insertionSort(a, n, 0);
}