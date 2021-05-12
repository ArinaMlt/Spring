package OOP6;

public interface IOperation {
    boolean contains(IOperation other);
    IOperation getUnion(IOperation other);
    IOperation getIntersection(IOperation other);
}
