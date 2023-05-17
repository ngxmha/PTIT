#include<bits/stdc++.h>

using namespace std;

struct person{
	string name, date;
};

bool cmp(person a, person b){
	string y1 = a.date.substr(6) , y2 = b.date.substr(6);
	if(y1 != y2)
		return y1 < y2;
	int m1 = (a.date[3] - '0') * 10 + (a.date[4] - '0'), m2 = (b.date[3] - '0') * 10 + (b.date[4] - '0');
	if(m1 != m2)
		return m1 < m2;
	int d1 = (a.date[1] - '0') * 10 + (a.date[0] - '0'), d2 = b.date[1] - '0' * 10 + b.date[0] - '0'; 
	return m1 < m2;  
}

int main(){
	int n;
	cin >> n;
	person p[n];
	for(int i = 0; i < n; i++){
		cin >> p[i].name;
		cin.ignore();
		getline(cin, p[i].date);
	}
	sort(p, p + n, cmp);
	cout << p[n-1].name << endl << p[0].name;
}
