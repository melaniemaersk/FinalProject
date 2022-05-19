#include<iostream>
using namespace std;

int main(){


	double radius, area, circumference;
	
	cout << "Please input radius: ";
	cin >> radius;
	
	area = 3.14 * (radius*radius);
	circumference = 2 * 3.14 * radius;
	
	cout << "The area of the circle is " << area << " and the circumference is "
	     << circumference << endl;
	     
	return 0;
}

