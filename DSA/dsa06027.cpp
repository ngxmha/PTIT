#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int a[n];
		for(int &x : a)
			cin >> x;
		vector<int> v[n];
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				if(a[j] < a[i]){
					swap(a[i], a[j]);
				}
			}
			// string s = "";
			// for(int i = 0; i < n; i++){
			// 	s += to_string(a[i]) + " ";
			// }
			// v.push_back(s);
			for(int k = 0; k < n; k++){
				v[i].push_back(a[k]);
			}
		}
		for(int i = n - 2; i >= 0; i--){
			cout << "Buoc " << i + 1 << ": ";
			for(int j = 0; j < v[i].size() - 1; j++){
				cout << v[i][j] << " ";
			}
			cout << v[i][v[i].size() - 1];
			cout << endl;
		}
	}
}

// #include<bits/stdc++.h>
// using namespace std;
// int main()
// {
// 	int t; cin>>t;
// 	while(t--)
// 	{
// 		int n; cin>>n;
// 		int a[n];
// 		for(int i=0;i<n;i++) cin>>a[i];
// 			vector<string> s(n);
// 		for(int i=0;i<n-1;i++)
// 		{
// 			s[i]="Buoc ";
// 			string tmp=to_string(i+1)+": ";
// 			s[i]+=tmp;
// 			for(int j=i+1;j<n;j++)
// 			{
// 				if(a[i]>a[j]) swap(a[i],a[j]);
// 			}
// 			for(int k=0;k<n;k++)
// 			{
// 				string tmp1=to_string(a[k])+" ";
// 				s[i]+=tmp1;
// 			}
// 		}
// 		for(int i=n-1;i>=0;i--) cout<<s[i]<<endl;
// 	}
// }