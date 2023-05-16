#include<iostream>
#include<stack>
using namespace std;

void testcase(){
	string s;	cin >> s;
	stack<string> st;
	for(int i = s.size() - 1; i >= 0; i--){
		if(s[i] != '+' && s[i] != '-' && s[i] != '*' && s[i] != '/')
			st.push(string(1, s[i]));
		else {
			string fi = st.top();	st.pop();
			string se = st.top();	st.pop();
			string tmp = fi + se + s[i];
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
	