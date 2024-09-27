#include <stdio.h>

int st[10];
int top = -1;
void push(int val){
    if(top>=99){
        printf("stackover flow");
        
    }
    else
    {
        st[++top]=val;
    }
}

char pop(){
    if(top==-1){
        printf("stack underflow");
        return;
    
    }else
    return st[top--];
    }
    
    
    void main()
    {
        char ch[]="hello";
        for(int i=0;ch[i]!='\0';i++)
        push(ch[i]);
    
        printf("stack value is %s",st);
        
        for(int i=0;i<strlen(st);i++){
            ch[i]=pop();
        }
        printf("\nreverse value is = %s",ch);
        
        
    }






