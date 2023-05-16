#include<iostream>
#include<stack>
using namespace std;

void testcase(){
	string s;	cin >> s;
	stack<char> st;
	int ans = 0;
	for(int i = 0; i < s.size(); i++){
		if(st.empty())
			st.push(s[i]);
		else {
			if(st.top() == '(' && s[i] == ')'){
				st.pop();
			}
			else{
				st.push(s[i]);
			}
		}
	}
	while(!st.empty()){
		char s = st.top();
		st.pop();
		if(st.top() == '(' && s == '('){
			ans++;
			st.pop();
		}
		else if(st.top() == ')' && s == ')'){
			st.pop();
			ans++;
		}
		else {
			st.pop();
			ans += 2;
		}
	}
	cout << ans << endl;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	// 	freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}