#include<iostream>
#include<limits.h>
using namespace std;

void testcase(){
	int n;
	cin >> n;
	pair<int, int> p[n + 1];
	for(int i = 1; i <= n; i++){
		int x;
		cin >> x;
		p[x].second = i;
	}
	int res = INT_MIN;
	for(int i = 1; i < n; i++){
		int cnt = 1;
		while(i < n && p[i + 1].second > p[i].second){
			i++;
			cnt++;
		}
		res = max(res, cnt);
	}
	cout <<  n - res;
}

int main(){
	int t = 1;
	while(t--){
		testcase();
	}
}