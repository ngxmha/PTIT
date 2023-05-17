#include<bits/stdc++.h>

using namespace std;

struct tg{
	int gio, phut, giay;
};

bool cmp(tg a, tg b){
	if(a.gio != b.gio)	
		return a.gio < b.gio;
	if(a.phut != b.phut)
		return a.phut < b.phut;
	return a.giay < b.giay;
}

int main(){
	int n;
	cin >> n;
	tg t[n];
	for(int i = 0; i < n; i++){
		cin >> t[i].gio >> t[i].phut >> t[i] .giay;
	}
	sort(t, t + n, cmp);
	for(int i = 0; i < n; i++){
		cout << t[i].gio << " " << t[i].phut << " " << t[i].giay << endl;
	}
}