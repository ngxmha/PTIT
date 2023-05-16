#include<iostream>
#include<stack>
using namespace std;

int uutien(char c){
	if(c == '^')	return 3;
	else if(c == '*' || c == '/')	return 2;
	else if(c == '+' || c == '-')	return 1;
	return 0;
}

void testcase(){
	string s;	cin >> s;
	stack<char> st;
	string res = "";
	for(int i = 0; i < s.size(); i++){
		if(isalpha(s[i]))
			res += s[i];
		else if(s[i] == '(')
			st.push(s[i]);
		else if(s[i] == ')'){
			while(!st.empty() && st.top() != '('){
				res += st.top();
				st.pop();
			}
			if(st.top() == '(')
				st.pop();
		}
		else {
			while(!st.empty() && (uutien(st.top()) >= uutien(s[i]))){
				res += st.top();
				st.pop();
			}
			st.push(s[i]);
		} 
	}
	while(!st.empty()){
		if(st.top() == '('){
			st.pop();
			continue;
		}
		res += st.top();
		st.pop();
	}
	cout << res << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	