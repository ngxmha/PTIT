#include<iostream>
using namespace std;

int n;
bool a[101], xuoi[101], nguoc[101];

void back_track(int i, int &cnt){
	for(int j = 1; j <= n; j++){
		if(!a[j] && !xuoi[i - j + n] && !nguoc[i + j - 1]){
			a[j] = xuoi[i - j + n] = nguoc[i + j -1] = true;
			if(i == n)
				cnt++;
			else
				back_track(i+1, cnt);
			a[j] = xuoi[i - j + n] = nguoc[i + j -1] = false;
		}
	}
}

void testcase(){
	cin >> n;
	int cnt = 0;
	for(int i = 1; i <= n; i++){
		a[i] = xuoi[i] = nguoc[i] = false;
	}
	back_track(1, cnt);
	cout << cnt;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
		cout << endl;
	}
}