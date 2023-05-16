#include<iostream>
#include<queue>
using namespace std;

void testcase(){
	int t;
	cin >> t;
	queue<int> q;
	while(t--){
		int n;
		cin >> n;
		if(n == 1){
			cout << q.size() << endl;
		}
		else if(n == 2){
			if(q.empty())
				cout << "YES\n";
			else
				cout << "NO\n";
		}
		else if (n == 3){
			int a;
			cin >> a;
			q.push(a);
		}
		else if(n == 4){
			if(!q.empty())
				q.pop();
		}
		else if (n == 5){
			if(!q.empty())
				cout << q.front() << endl;
			else
				cout << "-1\n";
		}
		else {
			if(!q.empty())
				cout << q.back() << endl;
			else 
				cout << "-1";
		}
	}
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
