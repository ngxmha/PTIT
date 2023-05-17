#include<bits/stdc++.h>

using namespace std;

#define PI 3.141592653589793238

struct Point{
	double a,b;

	double distance(Point other){
		return sqrt((other.a - a) * (other.a - a) + (other.b - b) * (other.b - b)); 
	}
};

double bankinh(Point x, Point y, Point z){
	double a = x.distance(y), b = y.distance(z), c = z.distance(x);
	if(a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
		return false;
	double  p  = (a + b + c) / 2;
	double s = sqrt(p * (p - a) * (p - b) * (p - c));
	double r = a * b * c / (4 * s);
	return PI * r * r;
}


int main(){
	int t;
	cin >> t;
	while(t--){
		Point x,y,z;
		cin >> x.a >> x.b >> y.a >> y.b >> z.a >> z.b;
		if(bankinh(x,y,z)) 
			cout << fixed << setprecision(3) << bankinh(x,y,z);
		else 
			cout << "INVALID";
		cout << endl;
	}
}