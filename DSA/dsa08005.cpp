#include<iostream>
#include<queue>
using namespace std;

void testcase(){
	int n;
	cin >> n;
	queue<string> q;
	q.push("1");
	while(n--){
		string temp = q.front();
		q.pop();
		cout << temp << " ";
		string s1 = temp + "0", s2 = temp + "1";
		q.push(s1);
		q.push(s2);
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
	