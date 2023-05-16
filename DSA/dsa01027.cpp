#include<bits/stdc++.h>
using namespace std;

int n, a[10], ok = 1;

void begin(){
	for(int i = 1; i <= n; i++){
		a[i] = i;
	}
}

void next(){
	int i = n - 1;
	while(i >= 1 && a[i] > a[i+1])
		i--;
	if(i == 0)
		ok = 0;
	else {
		int j = n;
		while(a[i] > a[j])
			j--;
		swap(a[i], a[j]);
		reverse(a+i+1, a+n+1);
	}
}

main(){
	cin >> n;
	begin();
	int b[n];
	for(int i = 0; i < n; i++){
		cin >> b[i];
	}
	sort(b, b + n);
	while(ok){
		for(int i = 1; i <= n; i++){
			cout << b[a[i]-1] << " ";
		}
		next();
		cout << endl;
	}
}