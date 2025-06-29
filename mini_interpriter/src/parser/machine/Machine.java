package parser.machine;

public interface Machine {
    void add();
    void sub();
    void mul();
    void div();
    void pow();
    void assign();
    void pushVal(int val);
    void pushId(int id);
    void pop();
    void print();
}