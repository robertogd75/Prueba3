#include <iostream>

using namespace std;

int main()
{
    int a = 0, b = 0, c = 0;

    cout << "Ingrese un número: ";
    cin >> a;

    cout << "Ingrese otro número: ";
    cin >> b;

    while(a <= b)
    {
        if (a%2 == 0)
        c = c + 1;
        a = a + 1;
    }

    count << c << endl;
    cin.ignore();
    return 0;
}
