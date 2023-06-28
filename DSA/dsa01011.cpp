#include <iostream>
#include<algorithm>
using namespace std;

string s;
bool check;

void next(){
    int i = s.size() - 1;
    while (i > 0 && s[i] <= s[i - 1]){
        i--;
    }
    if(i == 0)
        check = false;
    else{
        int j = s.size() - 1;
        while(s[j] <= s[i - 1]){
            j--;
        }
        swap(s[j], s[i - 1]);
        reverse(s.begin() + i, s.end());
    }
}

void solve(){
    int n;
    cin >> n >> s;
    check = true;
    next();
    cout << n << " ";
    if(!check)
        cout << "BIGGEST\n";  
    else 
        cout << s << endl;
}

int main(){
    // freopen("Input", "r", stdin);
    int t;  cin >> t;
    while(t--){
        solve();
    }
}
