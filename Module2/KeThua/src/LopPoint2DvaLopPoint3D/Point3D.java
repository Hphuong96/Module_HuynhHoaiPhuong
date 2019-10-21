package LopPoint2DvaLopPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0;
    private float[] xyz;
    public Point3D(){
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void  setXYZ(){
        this.xyz = new float[]{this.getX(),this.getY(),z};
    }
    public float[] getXYZ(){
        return this.xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                "z=" + z +
                ", xyz=" + Arrays.toString(xyz) +
                '}';
    }
}
