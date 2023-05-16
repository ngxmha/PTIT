#include<iostream>
using namespace std;

string change(string &s){
	for(int i = 0; i < s.size(); i++){
		if(s[i] == '6')
			s[i] = '5';
	}
	return s;
}

string change2(string &s){
	for(int i = 0; i < s.size(); i++){
		if(s[i] == '5')
			s[i] = '6';
	}
	return s;
} 
void testcase(){
	string a, b;
	cin >> a >> b;
	cout << stoi(change(a)) + stoi(change(b)) << " "  << stoi(change2(a)) + stoi(change2(b));
}

int main(){
	testcase();
}