#include<iostream>
#include<string.h>
using namespace std;

char c, x[9]; 
bool used[9];
// int n;

bool check(int n){
	for(int i = 1; i <= n - 1; i++){
		if(x[i] == 'A'){
			if(x[i - 1] != 'A' && x[i + 1] != 'A' && x[i - 1] != 'E' && x[i + 1] != 'E')
				return false;
		}
		else if(x[i] == 'E'){
			if(x[i - 1] != 'A' && x[i + 1] != 'A' && x[i - 1] != 'E' && x[i + 1] != 'E')
				return false;
		}
	}
	return true;
}

void in(int n){
	if(check(n)){
		for(int i = 0; i <= n; i++){
			cout << x[i];
		}
		cout << endl;
	}
}

void back_track(int i){
	for(char j = 'A'; j <= c; j++){
		if(!used[j - 65]){
			x[i] = j;
			used[j - 65] = true;
			if(i == c - 'A')
				in(i);
			else
				back_track(i + 1);
			used[j - 65] = false;
		}
	}
}
void testcase(){
	cin >> c;
	memset(used, false, sizeof(used));
	back_track(0);
}

int main(){
	testcase();
}
