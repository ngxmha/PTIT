#include<iostream>
#include<limits.h>
#include<algorithm>
using namespace std;

void testcase(){
	string s;
	cin >> s;	
	int a[26] = {0};
	for(int i = 0; i < s.size(); i++){
		a[s[i] - 97]++;
	}
	int max_fre = *max_element(a, a + 26);
	if(s.size() - max_fre >= max_fre - 1)
		cout << "1";
	else 
		cout << "-1";
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
		cout << endl;
	}
}