#include<iostream>
#include<queue>
#define ll long long
using namespace std;

void testcase(){
	int n;
	cin >> n;
	priority_queue<int, vector<int>, greater<int>> pq;
	for(int i = 0; i < n; i++){
		int x;
		cin >> x;
		pq.push(x);
	}
	ll opt = 0;
	while(pq.size() > 1){
		int first = pq.top();
		pq.pop();
		int second = pq.top();
		pq.pop();
		opt += first + second;
		pq.push(first + second);
	}
	cout << opt;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
		cout << endl;
	}
}