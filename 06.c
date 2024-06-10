// BUBBLE SORT AND SELECTION SORT
#include <stdio.h>
#include <stdlib.h>
void display(int arr[], int n);
void bubble_sort(int arr[], int n);
void selection_sort(int arr[], int n);

int main()
{
    int n, choice, i;
    printf("-->ENTER THE NUMBER OF ELEMENTS: ");
    scanf("%d", &n);
    int arr[n];
    printf("-->ENTER THE %d ELEMENTS: ", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("-->MENU\n");
    printf("-->1. BUBBLE SORT\n");
    printf("-->2. SELECTION SORT\n");
    printf("-->3. EXIT\n");
    printf("-->ENTER YOUR CHOICE: ");
    scanf("%d", &choice);
    switch (choice)
    {
    case 1:
        bubble_sort(arr, n);
        break;
    case 2:
        selection_sort(arr, n);
        break;
    case 3:
        exit(0);
        break;
    default:
        printf("-->INVALID CHOICE\n");
    }
    return 0;
}
void display(int arr[], int n)
{
    int i;
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void bubble_sort(int arr[], int n)
{
    int i, j, temp;
    for (i = 0; i < n - 1; i++)
    {
        for (j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    printf("AFTER SORTING: ");
    display(arr, n);
}

void selection_sort(int arr[], int n)
{
    int i, j, temp, min;
    for (i = 0; i < n - 2; i++)
    {
        min = i;
        for (j = i + 1; j < n - 1; j++)
        {
            if (arr[j] < arr[min])
            {
                min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    printf("AFTER SORTING: ");
    display(arr, n);
}