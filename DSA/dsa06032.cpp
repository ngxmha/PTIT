#include<iostream>
#include<algorithm>
using namespace std;

int n, k;

int first_pos(long long a[], int l, int r, long long x){
	int res = -1;
	while(l <= r){
		int m = (l + r) / 2;
		if(a[m] >= x){
			res = m;
			r = m - 1;
		}
		else 
			l = m + 1;
	}
	if(res == - 1)
		return n;
	return res;
}

void test(){
	cin >> n >> k;
	long long a[n];
	for(int i = 0; i < n; i++)
		cin >> a[i];
	long long res = 0;
	sort(a, a + n);
	for(int i = 0; i < n - 2; i++){
		for(int j = i + 1; j < n - 1; j++){
			long long x = k - a[i] - a[j];
			res += first_pos(a, j + 1, n - 1, x) - (j + 1);
		}
	}
	cout << res << endl;
}

int main(){
//	freopen("Inputc++.txt", "r", stdin);
	int t;
	cin >> t;
	while(t--){
		test();
	}
}
