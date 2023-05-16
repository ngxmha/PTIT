#include<iostream>
#include<stack>

using namespace std;

void testcase(){
	string s;
	getline(cin, s);
	stack<char> st;
	bool check;
	for(int i = 0; i < s.size(); i++){
		if(s[i] == ')'){
			check = true;
			while(!st.empty() && st.top() != '('){
				if(st.top() == '+' || st.top() == '-' || st.top() == '*' || st.top() == '/'){
					check = false;
				}
				st.pop();
			}
			if(!st.empty() && st.top() == '(')
				st.pop();
			if(check){
				cout << "Yes\n";
				return;
			} 
		}
		else 
			st.push(s[i]);
	}
	cout << "No\n";
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	cin.ignore();
	while(t--){
		testcase();
	}
}
	