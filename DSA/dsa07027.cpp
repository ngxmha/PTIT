 #include<iostream>
 #include<stack>
using namespace std;

void testcase(){
	int n;	cin >> n;
	int a[n];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	int r[n];
	stack<int> st;
	for(int i = 0; i < n; i++){
		if(st.empty()){
			st.push(i);
		}
		else {
			while(!st.empty() && a[st.top()] < a[i]){
				r[st.top()] = a[i];
				st.pop();
			}
			st.push(i);
		}
	}
	while(!st.empty()){
		r[st.top()] = -1;
		st.pop();
	}
	for(int i = 0; i < n; i++){
		cout << r[i] << " ";
	}
	cout << endl;
}
int main(){
	freopen("Inputc++.in", "r", stdin);
 	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
