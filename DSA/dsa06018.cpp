#include<bits/stdc++.h>
using namespace std;

bool cnt[1000001] = {0};

main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int min_val = INT_MAX, max_val = INT_MIN;
		for(int i = 0; i < n; i++){
			int x;
			cin >> x;
			min_val = min(x, min_val);
			max_val = max(x, max_val);
			cnt[x] = 1;
		}		
		int res = 0;
		for(int i = min_val; i <= max_val; i++){
			if(!cnt[i])
				res++;
		}
		cout << res << endl;
		memset(cnt, 0, sizeof(cnt));
	}
}