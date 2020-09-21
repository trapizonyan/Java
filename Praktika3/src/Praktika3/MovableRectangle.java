package Praktika3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRigth;
    public MovableRectangle(int x1, int y1,int x2,int y2, int xSpeed, int ySpeed, int radius){
        this.topLeft.x=x1;
        this.bottomRigth.x=x2;
        this.topLeft.y=y1;
        this.bottomRigth.y=y2;
        this.topLeft.xSpeed=xSpeed;
        this.bottomRigth.xSpeed=xSpeed;
        this.topLeft.ySpeed=ySpeed;
        this.bottomRigth.ySpeed=ySpeed;


    };
    public String toString(){return "";};
    public void moveUp(){
        this.topLeft.y++;
        this.bottomRigth.y++;
    };
    public void moveDown(){
        this.topLeft.y--;
        this.bottomRigth.y--;
    };
    public void moveLeft(){
        this.topLeft.x--;
        this.bottomRigth.x--;
    };
    public void moveRight(){
        this.topLeft.x++;
        this.bottomRigth.x++;
    };
}
