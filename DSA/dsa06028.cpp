#include<bits/stdc++.h>
using namespace std;

// void step(int a[], int n, int m){
// 	string s = "Buoc " + to_string(m+1) + ": ";
// 	for(int i = 0; i < n; i++){
// 		s += to_string(a[i]) + " ";
// 	}
// 	v.push_back(s);
// }

void selectionSort(int a[], int n, int i){
	if(i == n - 1)
		return;
	int b[n];
	int min_pos = i;
	for(int j = i + 1; j < n; j++){
		if(a[j] < a[min_pos]){
			min_pos = j;
		}
	}
	swap(a[i],a[min_pos]);
	for(int k = 0; k < n; k++){
		b[k] = a[k];
	}
	selectionSort(a, n, i+1);
	cout << "Buoc " << i+1 << ": ";
	for(int k = 0; k < n - 1; k++){
		cout << b[k] << " ";
	}
	cout << b[n-1];
	cout << endl;
}

int main(){
	int n;
	cin >> n;
	int a[n], b[n];
	for(int &x : a)
		cin >> x;
	// vector<string> v;
	selectionSort(a,n,0);
	// for(int i = v.size() - 1; i >= 0; i--){
	// 	cout << v[i] << endl;
}