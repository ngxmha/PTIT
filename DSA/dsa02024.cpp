#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int a[20], n, x[20];
vector<string> v;

void save(int n){
	string s = "";
	for(int i = 1; i < n; i++){
		s += to_string(x[i]) + " ";
	}
	s += to_string(x[n]);
	v.push_back(s);
}

void back_track(int i, int k){
	for(int j = k; j < n; j++){
		if(a[j] > x[i - 1]){
			x[i] = a[j];
			if(i > 1 || (j == n - 1 && i > 1)){
				save(i);
				back_track(i + 1, j + 1);
			}
			else
				back_track(i + 1, j + 1);
		}
	}
}

void testcase(){
	cin >> n;
	for(int i = 0; i < n; i++)
		cin >> a[i];
	x[0] = 0;
	back_track(1, 0);
	sort(v.begin(), v.end());
	for(int i = 0; i < v.size(); i++)
		cout << v[i] << endl;
}

int main(){
	testcase();
}