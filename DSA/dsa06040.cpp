#include<iostream>
#include<vector>
using namespace std;

void test(){
	int l, m, n;
	cin >> l >> m >> n;
	long long a[l], b[m], c[n];
	for(auto &x : a)
		cin >> x;
	for(auto &x : b)
		cin >> x;
	for(auto &x : c)
		cin >> x;
	int i = 0, j = 0, k = 0;
	vector<long long> v; 
	while(i < l && j < m && k < n){
		if(a[i] == b[j] && b[j] == c[k]){
			v.push_back(a[i]);
			i++; j++; k++;
		}
		else if(a[i] <= b[j] && a[i] <= c[k]){
			i++;
		}
		else if(b[j] <= a[i] && b[j] <= c[k]){
			j++;
		}
		else
			k++;
	}
	if(v.size())
		for(int x = 0; x < v.size(); x++){
			cout << v[x] << " ";
		}
	else
		cout << "-1";
	cout << "\n";
}

int main(){
	int t;
	cin >> t;
	while(t--){
		test();
	}
}