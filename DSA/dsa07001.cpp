#include<iostream>
#include<vector>
using namespace std;

void testcase(){
	vector<int> v;
	string s;
	while(cin >> s){
		if(s == "push"){
			int n; cin >> n;
			v.push_back(n);
		}
		else if(s == "pop"){
			if(v.empty()){
				cout << "empty";
				return;
			}
			v.pop_back();
		}
		else {
			if(v.empty()){
				cout << "empty";
				return;
			}
			for(int i = 0; i < v.size(); i++){
				cout << v[i] << " ";
			}
			cout << endl;
		}
	}
}
int main(){
	int t = 1;	//cin >> t;
	while(t--){
		testcase();
	}
}