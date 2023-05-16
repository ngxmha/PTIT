#include<iostream>
#include<queue>
using namespace std;

void testcase(){
	int t;
	cin >> t;
	queue<int> q;
	while(t--){
		string s;
		cin >> s;
		if(s == "PUSH"){
			int n;
			cin >> n;
			q.push(n);
		}
		else if(s == "POP"){
			if(!q.empty())
				q.pop();
		}
		else {
			if(!q.empty())
				cout << q.front() << endl;
			else 
				cout << "NONE\n";
		}
	}
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t = 1;	//cin >> t;
	while(t--){
		testcase();
	}
}
	