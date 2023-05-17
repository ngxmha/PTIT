#include<bits/stdc++.h>

using namespace std;

int main(){
	ifstream file("PTIT.in");
	ofstream file2("PTIT.out");
	string s;
	while(!file.eof()){
		getline(file, s);
		file2 << s << endl;
	}
}