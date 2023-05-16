#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

bool cmp(pair<int, int> a, pair<int, int> b){
	return a.second < b.second;
}

void work_arrange(pair<int, int> p[], int n){
	int i = 0, j = 1;
	sort(p, p + n, cmp);
	vector<pair<int, int>> v;
	v.push_back(p[0]);
	// int cnt = 1;
	while(j < n){
		if(p[j].first >= p[i].second){
			v.push_back(p[j]);			
			//cnt++;
			i = j;
			j = i + 1;
		}
		else
			j++;
	}
	cout << v.size();
	// cout << cnt;
}

void testcase(){
	int n;
	cin >> n;
	pair<int, int> sf[n];
	for(int i = 0; i < n; i++){
		cin >> sf[i].first;
	}
	for(int i = 0; i < n; i++){
		cin >> sf[i].second;
	}
	work_arrange(sf, n);
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
		cout << endl;
	}
}