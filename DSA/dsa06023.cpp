#include<bits/stdc++.h>

using namespace std;

int main(){
	int n;
	cin >> n;
	int a[n];
	for(int &x : a){
		cin >> x;
	}
	int k = 1;
	for(int i = 0; i < n-1; i++){
		for(int j = i + 1; j < n; j++){
			if(a[j] < a[i])
				swap(a[i], a[j]);
		}
		cout << "Buoc " << k << ": ";
		for(int m = 0; m < n; m++){
			cout << a[m] << " ";
		}
		cout << endl;
		k++;
	}
}