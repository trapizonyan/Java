package Praktika3;

public class MovableCircle implements Movable {
    private int radius;
    private  MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center.x=x;
        this.center.y=y;
        this.center.xSpeed=xSpeed;
        this.center.ySpeed=ySpeed;
        this.radius=radius;

    };
    public String toString(){return "scdds";};
    public void moveUp(){this.center.y++;};
    public void moveDown(){this.center.y--;};
    public void moveLeft(){this.center.x--;};
    public void moveRight(){this.center.x++;};

}
