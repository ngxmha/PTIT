#include<iostream>
using namespace std;

int n, k, x[11];
char c;

void out(){
	for(int i = 1; i <= k; i++){
		cout << char(x[i]+64);
	}
	cout << endl;
}
void back_track(int i, int l){
	for(int j = l; j <= n; j++){
		x[i] = j;
		if(i == k)
			out();
		else
			back_track(i+1, j);
	}
}

void testcase(){
	cin >> c >> k;
	n = c - 'A' + 1;
	back_track(1,1);
}

int main(){
	testcase();
}