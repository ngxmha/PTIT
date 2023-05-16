#include<iostream>
#include<stack>
using namespace std;

void testcase(){
	string s; cin >> s;
	stack<char> st;
	for(int i = 0; i < s.size(); i++){
		if(s[i] == '(' || s[i] == '[' || s[i] == '{')
			st.push(s[i]);
		else {
			if(st.empty()){
				cout << "NO\n";
				return;
			}
			else if(st.top() == '(' && s[i] == ')')
				st.pop();
			else if(st.top() == '[' && s[i] == ']')
				st.pop();
			else if(st.top() == '{' && s[i] == '}')
				st.pop();
			else {
				cout << "NO\n";
				return;
			} 
		}
	}
	cout << "YES\n";	
}

int main(){
	int t; cin >> t;
	while(t--){
		testcase();
	}
}
	