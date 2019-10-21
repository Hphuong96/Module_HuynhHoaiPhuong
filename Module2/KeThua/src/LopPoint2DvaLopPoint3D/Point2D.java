package LopPoint2DvaLopPoint3D;

import java.util.Arrays;

public class Point2D {
    private float x = 0;
    private float y = 0;
    private float[] xy;
    public Point2D(){
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(){
        this.xy = new float[]{this.x,this.y};
    }
    public float [] getXY(){
        return this.xy;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", xy=" + Arrays.toString(this.xy) +
                '}';
    }
}
