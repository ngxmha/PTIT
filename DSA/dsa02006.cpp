#include<iostream>
using namespace std;
#include<algorithm>
int n, k, x[11], check = 0;

void in(int i){
	cout << "[";
	for(int j = 0; j < i; j++){
		cout << x[j] << " ";
	}
	cout << x[i] << "] ";
}

void back_track(int a[], int i, int j, int sum){
	for(int m = j; m < n; m++){
		if(sum + a[m] < k){
			sum += a[m];
			x[i] = a[m];
			back_track(a, i+1, m+1, sum);
			sum -= a[m];
		}
		else if(sum + a[m] == k){
			check = 1;
			x[i] = a[m];
			in(i);
		}
	}
}

void testcase(){
	cin >> n >> k;
	int a[n];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	sort(a, a+n);
	back_track(a, 0, 0, 0);
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