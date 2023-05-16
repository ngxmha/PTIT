#include<iostream>
#include<algorithm>
using namespace std;

void testcase(){
	int n;
	cin >> n;
	int a[n];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	sort(a, a + n, greater<int>());
	int res = max({a[0] * a[1], a[0] * a[1] * a[2], a[n-1] * a[n-2], a[n-1] * a[n-2] * a[0]});
	cout << res;
}

int main(){
	int t = 1;
	while(t--){
		testcase();
	}
}