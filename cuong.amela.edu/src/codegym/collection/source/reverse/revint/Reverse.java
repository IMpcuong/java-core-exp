package codegym.collection.source.reverse.revint;

import codegym.collection.source.GenericStack;

public class Reverse {

    private int in;
    private int out;

    public Reverse(int in){
        this.in = in;
    }

    public int doReverse(){
        GenericStack<Integer> stack = new GenericStack<Integer>();

        while(in > 0){
            stack.push(in % 10);
            in /= 10;
        }

        out = 0;
        int i = 0;

        while(!stack.isEmpty()){
            int temp = stack.pop();
            out = out + (int) Math.pow(10, i++) * temp;
        }
        return out;
    }
}