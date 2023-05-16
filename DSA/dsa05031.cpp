#include<iostream>
#include<math.h>
using namespace std;

main(){
	int t, i, j, n, f[10002];
	cin >> t;
	f[1] = 1; f[2] = 2; f[3] = 3;
	for(int i = 4; i <= 10000; i++){
		f[i] = i;
		for(int j = 1; j <= sqrt(i); j++){
			f[i] = min(f[i], f[i-j*j] + 1);
		}
	}
	while(t--){
		cin >> n;
		cout << f[n] << endl;
	}
}
