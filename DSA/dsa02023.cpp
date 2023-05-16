#include<iostream>
#include<algorithm>
#include<vector>
#include<set>
using namespace std;

int n, k, m, x[15];
vector<string> v;

void out(){
	for(int i = 1; i <= k-1; i++){
		cout << v[x[i]-1] << " ";
	}
	cout << v[x[k]-1] << endl;
}

void Try(int i){
	for(int j = x[i-1]+1; j <= m-k+i; j++){
		x[i] = j;
		if(i == k){
			out();
		}
		else
			Try(i+1);
	}
}

void testcase(){
	cin >> n >> k;
	set<string> s;
	for(int i = 0; i < n; i++){
		string x;
		cin >> x;
		s.insert(x);
	}
	for(string x : s){
		v.push_back(x);
	}
	m = v.size();
	Try(1);
}

int main(){
	testcase();
}