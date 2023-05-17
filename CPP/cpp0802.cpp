#include<bits/stdc++.h>

using namespace std;


bool check(string s){
	if(s.size() > 9) 
		return false;
	for(int i = 0; i < s.size(); i++){
		if(s[i] < '0' || s[i] > '9')
			return false;
	}
	return true;
}

int main(){
	ifstream file("DATA.in");
	// ofstream file2("PTIT.out");
	string s;
	long long sum = 0;
	while(file >> s){
		if(check(s)){
			long long a = stoll(s);
			if(a >= INT_MIN && a <= INT_MAX)
				sum += a;
		}
//		file2 << s << endl;
	}
	cout << sum;
} 