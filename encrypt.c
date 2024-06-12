// ENCRYPT AND DECRYPT
#include <stdio.h>
int main()
{
    int i, x;
    char str[100];
    printf("Enter the string : ");
    gets(str);
    printf("Please enter the choose: \n");
    printf("1. Encrypt\n2. Decrypt\n");
    scanf("%d", &x);
    switch (x)
    {
    case 1:
        for (i = 0; (i < 100 && str[i] != '\0'); i++)

            str[i] = str[i] + 3;
        printf("Encrypted string : %s\n", str);
        break;
    case 2:
        for (i = 0; (i < 100 && str[i] != '\0'); i++)

            str[i] = str[i] - 3;
        printf("Decrypted string : %s\n", str);
        break;
    default:
        printf("Wrong choice\n");
        break;
    }
    return 0;
}