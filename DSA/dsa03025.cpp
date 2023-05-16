#include<iostream>
#include<algorithm>
using namespace std;

bool cmp(pair<int, int> a, pair<int, int> b){
	return a.second < b.second;
}

void solve(pair<int, int> p[], int n){	
	sort(p, p + n, cmp);
	int i = 0, j = 1;
	int cnt = 1;
	while(j < n){
		if(p[j].first >= p[i].second){
			cnt++;
			i = j;
			j = i + 1;
		}
		else
			j++;
	}
	cout << cnt << endl;
}

void testcase(){
	int n;
	cin >> n;
	pair<int, int> pi[n];
	for(int i = 0; i < n; i++){
		cin >> pi[i].first >> pi[i].second;
	}
	solve(pi, n);
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
	}
}