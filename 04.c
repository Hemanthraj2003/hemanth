// linked list
#include <stdio.h>
#include <stdlib.h>
struct node
{
    int info;
    struct node *link;
};
typedef struct node *NODE;

NODE getnode()
{
    NODE x;
    x = (NODE)malloc(sizeof(struct node));
    return x;
}

NODE insert_front(int item, NODE first)
{
    NODE temp = getnode();
    temp->info = item;
    temp->link = first;
    first = temp;
    return first;
}

void display(NODE first)
{
    NODE temp;
    if (first == NULL)
    {
        printf("List is empty\n");
    }
    temp = first;
    while (temp != NULL)
    {
        printf("%d ", temp->info);
        temp = temp->link;
    }
}

NODE delete_front(NODE first)
{
    NODE temp;
    if (first == NULL)
    {
        printf("List is empty\n");
        return first;
    }
    temp = first;
    temp = temp->link;
    printf("item deleted = %d\n", first->info);
    free(first);
    return temp;
}
NODE delete_rear(NODE first)
{
    NODE prev;
    NODE cur;
    if (first == NULL)
    {
        printf("list is empty");
        return first;
    }
    if (first->link == NULL)
    {
        printf("The item deleted is %d", first->info);
        free(first);
        return NULL;
    }
    prev = NULL;
    cur = first;
    while (cur->link != NULL)
    {
        prev = cur;
        cur = cur->link;
    }
    printf("The item deleted is %d", cur->info);
    free(cur);
    prev->link = NULL;
    return first;
}

NODE delete_given_element(NODE first)
{
    int ele, i;
    NODE cur, prev;
    if (first == NULL)
    {
        printf("list is empty!!");
        return first;
    }
    printf("Enter the element to be deleted:");
    scanf("%d", &ele);
    cur = first;
    if (first->info == ele)
    {
        printf("\ndeleted element is %d", first->info);
        first = first->link;
        free(cur);
        return first;
    }
    while (cur != NULL)
    {
        if (cur->info == ele)
        {
            printf("\n the deleted element is %d", cur->info);
            prev->link = cur->link;
            free(cur);
            return first;
        }
        prev = cur;
        cur = cur->link;
    }
    if (cur == NULL)
    {
        printf("\nThe deleted element is not found");
        return first;
    }
}

int main()
{
    NODE first = NULL;
    int ch, item;
    while (1)
    {
        printf("\n-----------------LINKED LIST-----------------\n");
        printf("1.Insert\t2.Display\t3.Delete\t4.Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("Enter the item to be inserted:");
            scanf("%d", &item);
            first = insert_front(item, first);
            break;
        case 2:
            display(first);
            break;
        case 3:
            printf("\n-----------------DELETE MENU-----------------\n");
            printf("1.Delete from front\t2.Delete from rear\t3.Delete given element\n");
            printf("Enter your choice: ");
            scanf("%d", &ch);
            switch (ch)
            {
            case 1:
                first = delete_front(first);
                break;
            case 2:
                first = delete_rear(first);
                break;
            case 3:
                first = delete_given_element(first);
                break;
            }
            break;
        case 4:
            exit(0);
        default:
            printf("Wrong choice");
        }
    }
    return 0;
}