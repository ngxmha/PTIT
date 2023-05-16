#include<iostream>
#include<string.h>
using namespace std;

int n;
string s = "";
bool used[11];

bool check(){
	for(int i = 1; i < s.size(); i++){
		if(abs((s[i] - '0') - (s[i - 1] - '0')) == 1)
			return false;
	}
	return true;
}

void in(){
	if(check()){
		cout << s;
		cout << endl;
	}
}

void back_track(int i){
	for(int j = 1; j <= n; j++){
		if(!used[j]){
			s.push_back(char(j+48));
			used[j] = true;
			if(i == n)
				in();
			else
				back_track(i + 1);
			used[j] = false;
			s.pop_back();
		}
	}
}

void testcase(){
	cin >> n;
	memset(used, false, sizeof(used));
	back_track(1);
}

int main(){
	int t; 
	cin >> t;
	while(t--){
		testcase();
		cout << endl;
	}
}
