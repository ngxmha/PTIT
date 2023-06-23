#include<iostream>
using namespace std;


int M, N, K;
int a[1000001], b[1000001];

void input(){
	cin >> M >> N >> K;
	for(int i = 0; i < M; i++)
		cin >> a[i];
	for(int i = 0; i < N; i++)
		cin >> b[i];
}

void solve(){
	int cnt = 0, i = 0, j = 0, res;
	while(i < M && j < N){
		cnt++;
		if(a[i] < b[j]){
			if(cnt == K){
				cout << a[i] << endl;
				return;
			}
			i++;
		}
		else {
			if(cnt == K){
				cout << b[j] << endl;
				return;
			}
			j++;
		}
	}
	while(i < M){
		cnt++;
		if(cnt == K){
			cout << a[i] << endl;
			return;
		}
		i++;
	}
	while(j < N){
		cnt++;
		if(cnt == K){
			cout << b[j] << endl;
			return;
		}
		j++;
	}
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		solve();
	}
}
