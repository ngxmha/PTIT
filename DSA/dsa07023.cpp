#include<iostream>
#include<stack>
#include<sstream>
using namespace std;

void testcase(){
	stack<string> st;
	string s;
	getline(cin, s);
	stringstream ss(s);
	string temp;
	while(ss >> temp){
		st.push(temp);
	}
	while(!st.empty()){
		cout << st.top() << " ";
		st.pop();
	}
	cout << endl;
}

int main(){
	int t;	cin >> t;
	// cin.ignore();
	while(t--){
		testcase();
	}
}
