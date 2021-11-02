package com.company;

import java.util.ArrayList;
import java.util.List;

public class StackClass <Tipo> implements Stack <Tipo>{

    private List<Tipo> stack = new ArrayList<>();

    public void push(Tipo ob) {
        this.stack.add(ob);
    }

    public Tipo pop(){
        Tipo ob = this.stack.get(stack.size()-1);
        this.stack.remove(stack.size()-1);
        return ob;
    }

    public Tipo top(){
        return this.stack.get(stack.size()-1);
    }

    public boolean isEmpty(){
        return (this.stack.size() == 0);
    }
}
