#include<bits/stdc++.h>

using namespace std;

int n, ok = 1;
string s;

// void in(){
// 	for(int i = 1; i <= n; i++){
// 		cout << a[i] << " ";
// 	}
// 	cout << endl;
// }

// bool check(){
// 	int l = 1, r = n;
// 	while(l < r){
// 		if(a[l] != a[r])
// 			return false;
// 		l++; r--;
// 	}
// 	return true;
// }

// void Try(int i){
// 	for(int j = 0; j <= 1; j++){
// 		a[i] = j;
// 		if(i == n){
// 			if(check())
// 				in();
// 		} 
// 		else 
// 			Try(i+1);
// 	}
// }

// int main(){
// 	cin >> n;
// 	Try(1);
// }

void next(){
	int i = s.size() - 1;
	while(i >= 0 && s[i] == '1'){
		s[i] = '0';
		i--;
	}
	if(i == -1)
		ok = 0;
	else
		s[i] = '1';
}

bool check(){
	int l = 0, r = s.size()-1;
	while(l < r){
		if(s[l] != s[r])
			return false;
		l++; r--;
	}
	return true;
}

int main(){
	cin >> n;
	s = string(n, '0');
	while(ok){
		if(check()){
			for(int i = 0; i < s.size(); i++){
				cout << s[i] << " ";
			}
			cout << endl;
		}
		next();
	}
}