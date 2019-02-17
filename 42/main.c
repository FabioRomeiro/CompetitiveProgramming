#include <stdio.h>

int main()
{
    int number;
    while (scanf("%d", &number))
    {
        if (number == 42) break;
        printf("%d\n", number);
    }
}