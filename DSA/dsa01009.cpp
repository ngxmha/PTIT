#include<iostream>
#include<vector>
using namespace std;

int N, K, x[101], a[101], cnt;
vector<string> v;

void out(){
	string s;
	for(int i = 1; i <= N; i++){
		s += char(x[i] + 65);
	}
	v.push_back(s);
}

bool check(){
	int res = 0, s = 1;
	for(int i = 1; i <= N - 1; i++){
		if(x[i] == 0){
			if(x[i+1] == 0){
				s++;
				if(s > K)
					return false;
				else if(s == K)
					res++;
			}
		}
		else
			s = 1;
	}
	return res == 1;
}

void Try(int i){
	for(int j = 0; j <= 1; j++){
		x[i] = j;
		if(i == N){
			if(check()){
				cnt++;
				out();
			}
		}
		else {
			Try(i+1);
		}
	}
}

void solve(){
	cin >> N >> K;
	Try(1);
	cout << cnt << endl;
	for(int i = 0; i < v.size(); i++){
		cout << v[i] << endl;
	}
}


int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t = 1;
	// cin >> t;
	while(t--){
		solve();
	}
}

