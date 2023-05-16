#include<iostream>
#include<queue>
using namespace std;

void testcase(){
	int n;
	cin >> n;
	queue<string> q;
	q.push("9");
	while(true){
		string temp = q.front();
		q.pop();
		int t = stoi(temp);
		if(t % n == 0){
			cout << t << endl;
			return;
		}
		string s1 = temp + "0", s2 = temp + "9";
		q.push(s1);
		q.push(s2);
	}	
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	