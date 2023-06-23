#include<iostream>
#include<algorithm>
using namespace std;

int n, k;
int a[100001];

int first_pos(int l, int r, int x){
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
	for(int i = 0; i < n; i++)
		cin >> a[i];
	long long res = 0;
	sort(a, a + n);
	for(int i = 0; i < n - 1; i++){
		int x = k + a[i];
		res += first_pos(i + 1, n - 1, x) - (i + 1);
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

