package Pr7;

public class Queue {

    int size, i=-1;
    int qu[];

    Queue(int size)
    {
        this.size=size;
        qu=new int[size];
        for (int j=0; j<size; j++)
            qu[i]=-1;
    }

    public void add(int num)
    {
        i++;
        if (i>=size)
        {
            System.out.print("Stack overflow");
            return;
        }
        qu[i]=num;
    }

    public void delete()
    {
        if (i==-1)
        {
            System.out.print("Stack underflow");
            return;
        }
        for (int j=0; j<i; j++)
        {
            qu[j]=qu[j+1];
        }
        qu[i]=-1;
        i--;
    }

    public int get()
    {
        if (i==-1)
        {
            System.out.print("Stack underflow");
            return -1;
        }
        return qu[0];
    }
}