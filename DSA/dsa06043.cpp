#include<iostream>
using namespace std;

int test(){
	int n;
	cin >> n;
	int a[n];
	int sum = 0;
	for(int i = 0; i < n; i++){
		cin >> a[i];
		sum += a[i];
	}
	int res = -1, ans = 0;
	for(int i = 0; i < n; i++){
		ans += a[i];
		if(ans == sum - ans + a[i])
			return i+1;
	}
	return res;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		cout << test() << endl;
	}
}
