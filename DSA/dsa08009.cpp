#include<iostream>
#include<queue>
using namespace std;

void testcase(){
	int s, t;
	cin >> s >> t;
	int a[20001] = {0};
	queue<int> q;
	q.push(s);
	while(a[t] == 0){
		int b = q.front();
		q.pop();
		if(b - 1 > 0 && a[b - 1] == 0){
			a[b - 1] = a[b] + 1;
			q.push(b - 1);
		} 
		if(b * 2 < 20000 && a[b * 2] == 0){
			a[b * 2] = a[b] + 1;
			q.push(b * 2);
		}
	}
	cout << a[t] << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	