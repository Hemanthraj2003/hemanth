#include <stdio.h>
#include <string.h>
int main()
{
    int a[20], b[30], i, j, k, count, n;
    printf("Enter frame length: ");
    scanf("%d", &n);
    printf("Enter input frame(0 and 1)");
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);
    i = 0;
    count = 0;
    j = 0;
    while (i < n)
    {
        if (a[i] == 1)
        {
            b[j] = a[i];
            count++;
            if (count == 5)
            {
                j++;
                b[j] = 0;
                count = 0;
            }
        }
        else
        {
            b[j] = a[i];
        }
        i++;
        j++;
    }
    printf("After stuffing the frame: ");
    printf("01111110 ");
    for (i = 0; i < j; i++)
    {
        printf("%d", b[i]);
    }
    printf(" 01111110");
    return 0;
}