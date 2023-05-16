#include<iostream>
#include<stack>
using namespace std;

bool check(char c){
	return c == '+' || c == '-' || c == '*' || c == '/';
}

void testcase(){
	string s;	cin >> s;
	stack<string> st;
	for(int i = s.size() - 1; i >= 0; i--){
		if(!check(s[i]))
			st.push(string(1, s[i]));
		else {
			string fi = st.top();	st.pop();
			string se = st.top();	st.pop();
			string tmp = '(' + fi + s[i] + se + ')';
			st.push(tmp);
		}
	}
	cout << st.top() << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	