// linear and binary search
#include <stdio.h>
#include <stdlib.h>
void main()
{
    int a[25], ch, n, i, item, last, beg = 0, mid;
    printf("-->ENTER THE NUMBER OF ELEMENTS: ");
    scanf("%d", &n);
    printf("-->ENTER THE %d ELEMENTS: ", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("---->MENU\n");
    printf("-->1. LINEAR SEARCH\n");
    printf("-->2. BINARY SEARCH\n");
    printf("-->3. EXIT\n");
    printf("-->ENTER YOUR CHOICE: ");
    scanf("%d", &ch);
    switch (ch)
    {
    case 1:
        printf("\n==>Enter the item to be searched: ");
        scanf("%d", &item);
        for (i = 0; i < n; i++)
        {
            if (a[i] == item)
            {
                printf("==>Item found at location %d", i + 1);
                break;
            }
        }
        if (i == n)
        {
            printf("\n\n!!!!!Item not found!!!!!\n\n");
        }
        break;
    case 2:
        printf("==>Enter the item to be searched: ");
        scanf("%d", &item);
        for (i = 0; i < n; i++)
        {
            last = n - 1;
            mid = (beg + last) / 2;
            if (a[mid] == item)
            {
                printf("==>Item found at location %d", mid + 1);
                break;
            }
            if (a[mid] < item)
            {
                beg = mid + 1;
            }
            if (a[mid] > item)
            {
                last = mid - 1;
            }
        }
        if (i == n)
        {
            printf("\n\n!!!!!Item not found!!!!!\n\n");
        }
        break;
    case 3:
        exit(0);
        break;
    default:
        printf("Invalid choice");
    }
}
