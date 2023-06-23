#include<iostream>
using namespace std;
#define ll long long

int N, a[101], sum;
bool check;

void input(){
	cin >> N;
	for(int i = 0; i < N; i++){
		cin >> a[i];
	}
	check = false;
	sum = 0;
}

void Try(int i, int s){
	if(check == true)
		return;	
	for(int j = i; j < N; j++){
		if(s + a[j] < sum / 2){
			Try(i + 1, s + a[j]);
		}
		else if(s + a[j] == sum / 2){
			check = true;
			return;
		}
	}
}

void solve(){
	for(int i = 0; i < N; i++){
		sum += a[i];
	}
	if(sum % 2 == 1){
		cout << "NO\n";
		return;
	}
	Try(0, 0);
	if(check)
		cout << "YES\n";
	else
		cout << "NO\n";
}

int main(){
//	freopen("Inputc++.txt", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		solve();
	}
}



	
