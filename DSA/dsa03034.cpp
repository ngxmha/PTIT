#include<iostream>
#include<vector>
using namespace std;

void solve(int a[], int b[], int c[], int n, int m, int k){
	int i = 0, j = 0, l = 0;
	vector<int> v;
	while(i < n && j < m && l < k){
		if(a[i] == b[j] && b[j] == c[l]){
			v.push_back(a[i]);
			i++; j++; l++;
		}
		else if(a[i] < b[j]){
			i++;
		}
		else if(b[j] < c[l]){
			j++;
		}
		else if(c[l] < a[i]){
			l++;
		}
	}
	if(v.empty()){
		cout << "NO";
		return;
	}
	for(int i = 0; i < v.size(); i++){
		cout << v[i] << " ";
	}
}

void testcase(){
	int n, m, k;
	cin >> n >> m >> k;
	int a[n], b[m], c[k];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	for(int i = 0; i < m; i++){
		cin >> b[i];
	}
	for(int i = 0; i < k; i++){
		cin >> c[i];
	}
	solve(a, b, c, n, m, k);
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
		cout << endl;
	}
}