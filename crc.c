#include <stdio.h>
#include <string.h>

#define N 28
char t[28], cs[28], g[28];
int a, e, c, b;

void xor () {
    for (c = 1; c < N; c++)
    {
        cs[c] = (cs[c] == g[c]) ? '0' : '1';
    }
}

    void crc()
{
    for (e = 0; e < N; e++)
    {
        cs[e] = t[e];
    }
    do
    {
        if (cs[0] == '1')
        {
            xor();
        }
        for (c = 0; c < N - 1; c++)
        {
            cs[c] = cs[c + 1];
        }
        cs[c] = t[e++];
    } while (e <= a + N - 1);
}

int main()
{
    int flag = 0;
    do
    {
        printf("\n1. CRC-12\n2. CRC-16\n3. CRC-CCITT\n4. Exit\n\nEnter your option: ");
        scanf("%d", &b);

        switch (b)
        {
        case 1:
            strcpy(g, "1100000001111");
            break;
        case 2:
            strcpy(g, "11000000000000101");
            break;
        case 3:
            strcpy(g, "10001000000100001");
            break;
        case 4:
            return 0;
        default:
            printf("Invalid option. Please try again.\n");
            continue;
        }

        printf("\nEnter data: ");
        scanf("%s", t);
        printf("\nGenerating polynomial: %s", g);

        a = strlen(t);
        for (e = a; e < a + N - 1; e++)
        {
            t[e] = '0';
        }
        t[e] = '\0';

        printf("\nModified data is: %s\n", t);

        crc();

        printf("Checksum is: %s", cs);

        for (e = a; e < a + N - 1; e++)
        {
            t[e] = cs[e - a];
        }
        t[e] = '\0';

        printf("\nFinal codeword is: %s\n", t);

        printf("\nTest error detection (0 for yes, 1 for no)?: ");
        scanf("%d", &e);

        if (e == 0)
        {
            do
            {
                printf("\nEnter the position where error is to be inserted: ");
                scanf("%d", &e);
            } while (e == 0 || e > a + N - 1);

            t[e - 1] = (t[e - 1] == '0') ? '1' : '0';
            printf("\nErroneous data: %s\n", t);
        }

        crc();

        for (e = 0; (e < N - 1) && (cs[e] != '1'); e++)
            ;

        if (e < N - 1)
        {
            printf("Error detected\n\n");
        }
        else
        {
            printf("No error detected\n\n");
        }

        printf("\n");
    } while (flag != 1);

    return 0;
}
