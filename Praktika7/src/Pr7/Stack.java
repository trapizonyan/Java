package Pr7;

public class Stack {

    int size, i = -1;
    int st[];

    Stack(int size) {
        this.size = size;
        st = new int[size];
    }

    public boolean isFull() {
        if (i >= size-1)
        {
            System.out.println("Stack overflow");
            return true;
        } else return false;
    }

    public boolean isEmpty() {
        if (i == -1) {
            System.out.println("Stack underflow");
            return true;
        } else return false;
    }

    public void add(int num) {
        i++;
        st[i] = num;
    }

    public void delete() {
        st[i] = -1;
        i--;
    }

    public int get() {
        return st[i];
    }

    public void printAll()
    {
        for (int j=i; j>-1; j--)
            System.out.print(st[j]+" ");
    }
}
