// implementing queue using array
#include <stdio.h>
#include <stdlib.h>
#define QUEUESIZE 5

int f, r, q[10], item;
insert_rear();
delete_front();
void display();
void main()
{
    int choice;
    r = -1;
    f = 0;
    for (;;)
    {
        printf("\n1.INSERT\t2.DELETE\t3.DISPLAY\t4.EXIT\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            insert_rear();
            break;
        case 2:
            delete_front();
            break;
        case 3:
            display();
            break;
        default:
            exit(0);
        }
    }
}

insert_rear()
{
    printf("Enter the item to be inserted: ");
    scanf("%d", &item);
    if (r == QUEUESIZE - 1)
    {
        printf("!!!!!!!!Overflow!!!!!!\n");
        return 1;
    }
    r = r + 1;
    q[r] = item;
}

delete_front()
{
    if (f > r)
    {
        printf("!!!!!!Underflow!!!!!!\n");
        return 1;
    }
    printf("The deleted element is %d", q[f++]);
    if (f > r)
        f = 0, r = -1;
}

void display()
{
    int i;
    if (f > r)
    {
        printf("!!!!!!Underflow!!!!!!\n");

        return;
    }
    printf("The elements in the queue are: ");
    for (i = f; i <= r; i++)
    {
        printf("%d ", q[i]);
    }
}