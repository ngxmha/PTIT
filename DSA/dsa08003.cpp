#include<iostream>
#include<queue>
using namespace std;

void testcase(){
	int t;
	cin >> t;
	deque<int> dq;
	while(t--){
		string s;
		cin >> s;
		if(s == "PUSHFRONT"){
			int n;
			cin >> n;
			dq.push_front(n);
		}
		else if(s == "PRINTFRONT"){
			if(!dq.empty())
				cout << dq.front() << endl;
			else
				cout << "NONE\n";
		}
		else if (s == "POPFRONT"){
			if(!dq.empty())
				dq.pop_front();
		}
		else if (s == "PUSHBACK"){
			int n;
			cin >> n;
			dq.push_back(n);
		}
		else if (s == "PRINTBACK"){
			if(!dq.empty())
				cout << dq.back() << endl;
			else 
				cout << "NONE\n";
		} 
		else {
			if(!dq.empty())
				dq.pop_back();
		}
	}
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t = 1;	//cin >> t;
	while(t--){
		testcase();
	}
}
	