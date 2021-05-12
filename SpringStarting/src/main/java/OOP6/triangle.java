package OOP6;

public class triangle extends shape implements IMove, ISwing{
    private point2d A, B, C;

    public triangle(){}

    public triangle(point2d A, point2d B, point2d C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public triangle (triangle other){
        this(other.getA(), other.getB(), other.getC());
    }

    public point2d getA(){
        return this.A;
    }

    public point2d getB(){
        return this.B;
    }

    public point2d getC(){
        return this.C;
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        else if (obj == null) return false;
        else if (this.getClass()!= obj.getClass()) return false;
        else {
            triangle other = (triangle) obj;
            return this.A.equals(other.A)&&this.B.equals(other.B)&&this.C.equals(other.C);
        }
    }

    public String toString(){
        return String.format("%nПервая точка: %f, %f\nВторая точка: %f, %f\nТретья точка: %f, %f\n", A.getX(), A.getY(), B.getX(), B.getY(), C.getX(), C.getY());
    }

    public double getPerimetr(){
        return A.getEuclideanDistanceTo(B)+A.getEuclideanDistanceTo(C)+C.getEuclideanDistanceTo(B);
    }

    public double getArea(){
        double p = this.getPerimetr()/2;
        return Math.sqrt(p*(p-A.getEuclideanDistanceTo(B))*(p-A.getEuclideanDistanceTo(C))*(p-B.getEuclideanDistanceTo(C)));
    }

    public void draw(){
        double[] x = {this.A.getX(), this.B.getX(), this.C.getX()};
        double[] y = {this.A.getY(), this.B.getY(), this.C.getY()};
        StdDraw.setPenColor(this.backgroundColor);
        StdDraw.filledPolygon(x, y);
        StdDraw.setPenColor(this.color);
        StdDraw.polygon(x, y);
    }

    public void move(double dx, double dy){
        this.A.move(dx, dy);
        this.B.move(dx, dy);
        this.C.move(dx, dy);
    }

    public void turn(double alpha){
        this.A.turn(alpha);
        this.B.turn(alpha);
        this.C.turn(alpha);
    }

    public point2d getCenter(){
        point2d M = new point2d(A);
        M.move((this.B.getX()+this.A.getX())/2, (this.B.getY()+this.A.getY())/2);
        M.move((this.C.getX()-M.getX())/3, (this.C.getY()-M.getY())/3);
        return M;
    }
}
