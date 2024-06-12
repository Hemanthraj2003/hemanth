#include <stdio.h>
#include <string.h>

int main()
{
    int i = 0, j = 0, n;
    char a[20], b[50];

    printf("Enter string: ");
    scanf("%s", a);

    n = strlen(a);
    b[0] = 'd';
    b[1] = 'l';
    b[2] = 'e';
    b[3] = 's';
    b[4] = 't';
    b[5] = 'x';
    j = 6;

    while (i < n)
    {
        if (a[i] == 'd' && a[i + 1] == 'l' && a[i + 2] == 'e')
        {
            b[j] = 'd';
            b[j + 1] = 'l';
            b[j + 2] = 'e';
            j += 3;
        }

        b[j] = a[i];
        i++;
        j++;
    }

    b[j] = 'd';
    b[j + 1] = 'l';
    b[j + 2] = 'e';
    b[j + 3] = 'e';
    b[j + 4] = 't';
    b[j + 5] = 'x';
    b[j + 6] = '\0';

    printf("\nFrame after stuffing:\n");
    printf("%s", b);

    return 0;
}
