#include<iostream>
#include<queue>
using namespace std;
#define ll long long 

void testcase(){
	int n;
	cin >> n;
	priority_queue<int, vector<int>, greater<int>> pq;
	for(int i = 0; i < n; i++){
		int x;
		cin >> x;
		pq.push(x);
	}
	string a = "", b = "";
	while(!pq.empty()){
		a += pq.top() + 48;
		pq.pop();
		if(pq.size() > 0){
			b += pq.top() + 48;
			pq.pop();
		}
	}
	cout << stoll(a) + stoll(b) << endl;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
	}
}