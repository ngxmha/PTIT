// #include<iostream>
// #include<vector>
// #include<algorithm>
// using namespace std;

// int n, check = 0; 
// vector<string> v;

// void back_track(bool a[][11], int n, int i, int j, int k, string s){
// 	if(i == n-1 && j == n-1){
// 		v.push_back(s);
// 		return;
// 	}

// 	if(i < n - 1 && a[i+1][j]){
// 		s += 'D';
// 		back_track(a, n, i+1, j, k+1, s);
// 	}

// 	if(j < n - 1 && a[i][j+1]){
// 		s += 'R';
// 		back_track(a, n, i, j+1, k+1, s);
// 	}
// }

// void testcase(){
// 	cin >> n;
// 	bool a[11][11];
// 	for(int i = 0; i < n; i++){
// 		for(int j = 0; j < n; j++)
// 			cin >> a[i][j];
// 	}
// 	if(!a[0][0] || !a[n-1][n-1]){
// 		cout << "-1";
// 		return;
// 	}
// 	back_track(a, n, 0, 0, 0, "");
// 	if(v.empty()){
// 		cout << "-1";
// 		return;
// 	}
// 	sort(v.begin(), v.end());
// 	for(int i = 0; i < v.size() - 1; i++){
// 		cout << v[i] << " ";
// 	}
// 	cout << v[v.size() - 1];
// 	v.clear();
// }
// int main(){
// 	int t;
// 	cin >> t;
// 	while(t--){
// 		testcase();
// 		cout << endl;
// 	}
// }

#include<iostream>
using namespace std;

int n, check = 0; 
char x[22];

void in(int n){
	check = 1;
	for(int i = 0; i <= n; i++){
		cout << x[i];
	}
	cout << " ";
}

void back_track(bool a[][11], int n, int i, int j, int k){
// 	if(i == n || j == n)
// 		return;
	if(i < n - 1 && a[i+1][j]){
		x[k] = 'D';
		if(i+1 == n-1 && j == n-1)
			in(k);
		else
			back_track(a, n, i+1, j, k+1);
	}
	if(j < n - 1 && a[i][j+1]){
		x[k] = 'R';
		if(i == n-1 && j+1 == n-1)
			in(k);
		else 
			back_track(a, n, i, j+1, k+1);
	}
}

void testcase(){
	cin >> n;
	bool a[11][11];
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++)
			cin >> a[i][j];
	}
	if(!a[0][0] || !a[n-1][n-1]){
	    cout << "-1";
	    return;
	}
	back_track(a, n, 0, 0, 0);
	if(!check)
		cout << "-1";
	check = 0;
}
int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
		cout << endl;
	}
}