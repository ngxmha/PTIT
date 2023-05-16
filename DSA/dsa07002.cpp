#include<iostream>
#include<stack>
// #include<cstdio>
using namespace std;

void testcase(){
	int q; 	cin >> q;
	stack<int> st;
	string s;
	while(q--){
		cin >> s;
		if(s == "PUSH"){
			int n; cin >> n;
			st.push(n);
		}
		else if(s == "POP"){
			if(st.empty()){
				continue;
			}
			st.pop();
		}
		else {
			if(st.empty())
				cout << "NONE";
			else 
				cout << st.top();
			cout << endl;
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
