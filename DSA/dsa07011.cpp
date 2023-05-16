#include<iostream>
#include<stack>
using namespace std;

void testcase(){
	string s;	cin >> s;
	stack<string> st;
	for(int i = 0; i < s.size(); i++){
		if(s[i] != '+' && s[i] != '-' && s[i] != '*' && s[i] != '/')
			st.push(string(1, s[i]));
		else {
			string fi = st.top();	st.pop();
			string se = st.top(); 	st.pop();
			string tmp = s[i] + se + fi;
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