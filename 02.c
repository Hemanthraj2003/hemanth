// evaluate postfix expression
#include <stdio.h>
#include <ctype.h>
#define MAX 20
typedef struct stack
{
    int data[MAX];
    int top;
} stack;

void init(stack *);
int pop(stack *);
void push(stack *, int);
int evaluate(char x, int op1, int op2);
int main()
{
    stack s;
    char x;
    int op1, op2, val;
    init(&s);
    printf("Enter the postfix expression : ");
    while ((x = getchar()) != '\n')
    {
        if (isdigit(x))
        {
            push(&s, x - 48);
        }
        else
        {
            op2 = pop(&s);
            op1 = pop(&s);
            val = evaluate(x, op1, op2);
            push(&s, val);
        }
    }
    val = pop(&s);
    printf("The value of the expression is : %d", val);
    return 0;
}

int evaluate(char x, int op1, int op2)
{
    if (x == '+')
        return (op1 + op2);
    if (x == '-')
        return (op1 - op2);

    if (x == '*')
        return (op1 * op2);
    if (x == '/')
        return (op1 / op2);
    if (x == '%')
        return (op1 % op2);
}

void init(stack *s)
{
    s->top = -1;
}

void push(stack *s, int x)
{
    s->top = s->top + 1;
    s->data[s->top] = x;
}

int pop(stack *s)
{
    int x;
    x = s->data[s->top];
    s->top = s->top - 1;
    return x;
}