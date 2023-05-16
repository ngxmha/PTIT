#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

string s = "///02/2///";
vector<string> v;
int i = 0, j = 1, k = 7, l = 8, m = 9;
char x[6];

void save(){
	s[i] = x[1];
	s[j] = x[2];
	if(s[0] == '0' && s[1] == '0')
		return;
	s[k] = x[3];
	s[l] = x[4];
	s[m] = x[5];
	v.push_back(s);
}
void back_track(int v){
	for(int u = 0; u <= 1; u++){
		if(u == 0)
			x[v] = '0';
		else 
			x[v] = '2';
		if(v == 5){
			save();
		}
		else
			back_track(v + 1);
	}
}

void testcase(){
	back_track(1);
	for(int u = 0; u < v.size(); u++){
		cout << v[u] << endl;
	}
}

int main(){
	testcase();
}