// #include<iostream>
// #include<stack>
// using namespace std;

// void testcase(){
// 	int n;	cin >> n;
// 	int a[n], l[n];
// 	stack<int> st;
// 	for(int i = 0; i < n; i++){
// 		cin >> a[i];
// 	}
// 	for(int i = n - 1; i >= 0; i--){
// 		if(st.empty()){
// 			st.push(i);
// 		}
// 		else{
// 			while(!st.empty() && a[i] > a[st.top()]){
// 				l[st.top()] = st.top() - i;
// 				st.pop(); 
// 			}
// 			st.push(i);
// 		}
// 	}
// 	while(!st.empty()){
// 		l[st.top()] = st.top() + 1;
// 		st.pop();
// 	}
// 	for(int i = 0; i < n; i++){
// 		cout << l[i] << " ";
// 	}
// 	cout << endl;
// }

// int main(){
// 	// freopen("Inputc++.in", "r", stdin);
// 	// freopen("Outputc++.out", "w", stdout);
// 	int t;	cin >> t;
// 	while(t--){
// 		testcase();
// 	}
// }

#include<iostream>
#include<stack>
using namespace std;

void testcase(){
	int n;	cin >> n;
	int a[n], l[n];
	stack<int> st;
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	for(int i = 0; i < n; i++){
		if(st.empty()){
			st.push(i);
		}
		else {
			while(!st.empty() && a[st.top()] < a[i]){
				st.pop();
			}
			if(!st.empty()){
				l[i] = i - st.top();
			}
			else 
				l[i] = i + 1;
			st.push(i);
		}
	}
	while(!st.empty()){
		l[st.top()] = st.top() + 1;
		st.pop();
	}
	for(int i = 0; i < n; i++){
		cout << l[i] << " ";
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
	