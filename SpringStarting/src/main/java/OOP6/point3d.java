package OOP6;

public class point3d {

    private double x;
    private double y;
    private double z;

    public point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public point3d() {
        this(0,0,0);
    }

    public point3d(point3d a) {
        this(a.getX(),a.getY(),a.getZ());
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public void setX(double value) {
        this.x = value;
    }

    public void setY(double value) {
        this.y = value;
    }

    public void setZ(double value){
        this.z = value;
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        else if (obj == null) return false;
        else if (this.getClass()!= obj.getClass()) return false;
        else {
            point3d other = (point3d) obj;
            return this.x==other.x&&this.y==other.y&&this.z==other.z;
        }
    }

    public double getEuclideanDistanceTo(point3d other){
        return Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2)+Math.pow(this.z - other.getZ(), 2));
    }

    public double getManhattanDistanceTo(point3d other){
        return Math.abs(this.x - other.getX()) + Math.abs(this.y - other.getY())+Math.abs(this.z - other.getZ());
    }

    public String toString(){
        return String.format("%f, %f, %f", x, y, z);
    }

}

