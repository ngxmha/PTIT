#include<iostream>
#include<algorithm>
using namespace std;

void testcase(){
	int n;
	cin >> n;
	int a[n];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	int m = n / 2;
	int i, j;
	if(n % 2){
		i = m - 1; j = m + 1;
		while(i >= 0 && j < n){
			int min_value = *min_element(a + i, a + j + 1);
			int max_value = *max_element(a + i, a + j + 1);
			if((min_value == a[i] && max_value == a[j]) || (min_value == a[j] && max_value == a[i])){
				i--;
				j++;
			}
			else {
				cout << "No\n";
				return;
			}
		}
		cout << "Yes\n";
	}
	else {
		i = m - 1; j = m;
		while(i >= 0 && j < n){
			int min_value = *min_element(a + i, a + j + 1);
			int max_value = *max_element(a + i, a + j + 1);
			if((min_value == a[i] && max_value == a[j]) || (min_value == a[j] && max_value == a[i])){
				i--;
				j++;
			}
			else {
				cout << "No\n";
				return;
			}
		}
		cout << "Yes\n";
	}
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
	} 
}