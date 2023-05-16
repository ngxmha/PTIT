#include<iostream>
#include<stack>
using namespace std;

void testcase(){
	string s;	cin >> s;
	stack<int> st;
	for(int i = 0; i < s.size(); i++){
		if(isdigit(s[i])){
			st.push(s[i] - '0');
		}
		else {
			int a = st.top();	st.pop();
			int b = st.top();	st.pop();
			if(s[i] == '+')
				st.push(a + b);
			else if(s[i] == '-')
				st.push(b - a);
			else if(s[i] == '*')
				st.push(a * b);
			else 
				st.push(b / a);	
		}
	}
	cout << st.top() << endl;
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	