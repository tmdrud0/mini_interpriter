package parser.machine;

import java.util.HashMap;
import java.util.Stack;

public class MachineImple implements Machine{

    Stack<Integer> stack;
    HashMap<Integer,Integer> map;
    static final Machine machine = new MachineImple();
    public MachineImple() {
        this.stack = new Stack<>();
        this.map = new HashMap<>();
    }
    @Override
    public void add() {
        int tmp = 0;
        tmp = stack.pop() + stack.pop();
        stack.push(tmp);
    }
    @Override
    public void sub() {
        int tmp = 0;
        tmp = - stack.pop() + stack.pop();
        stack.push(tmp);
    }
    @Override
    public void mul() {
        int tmp = 0;
        tmp = stack.pop() * stack.pop();
        stack.push(tmp);
    }
    @Override
    public void div() {
        int tmp = stack.pop();
        tmp = stack.pop() / tmp;
        stack.push(tmp);
    }
    @Override
    public void pow() {
        int tmp = 1;
        int e = stack.pop(), n = stack.pop();
        for(int i=0;i<e;i++)    tmp *= n;
        stack.push(tmp);
    }
    @Override
    public void assign() {
        int val = stack.pop(), id = stack.pop();
        map.put(id,val);
    }
    @Override
    public void pushVal(int val) {
        stack.push(val);
    }
    @Override
    public void pushId(int id) {
        if(!map.containsKey(id))    map.put(id, 0);
        stack.push(map.get(id));
    }
    @Override
    public void pop() {
        stack.pop();
    }
    @Override
    public void print() {
        System.out.println(stack.pop());
    }
}