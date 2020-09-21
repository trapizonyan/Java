package Praktika3;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    };
    public String toString(){return "";};
    public void moveUp(){this.y++;};
    public void moveDown(){this.y--;};
    public void moveLeft(){this.x--;};
    public void moveRight(){this.x++;};


}
