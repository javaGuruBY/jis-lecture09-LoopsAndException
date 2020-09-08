package by.jrr.loops.exceptions;

import by.jrr.loops.exceptions.exceptions.MyInitializeException;

public class ForCustomExceptionInInitialize {
    int a;
    static int b;

    static {
//        throw new MyInitializeException();
//        if(b == 0) throw new MyInitializeException(); //need to be hamdled
        try {
            throw new MyInitializeException();
        } catch (MyInitializeException e) {
            e.printStackTrace();
        }

//        if(b == 0) throw new Exception();
        if(b == 0) throw new RuntimeException();
    }

    //non static initialization
    {
//        throw new MyInitializeException();
        if(a == 0) throw new MyInitializeException();
        try {
            throw new MyInitializeException();
        } catch (MyInitializeException e) {

        }
        if(a == 0) throw new MyInitializeException();
        if(a == 0) throw new RuntimeException();
//        if(a == 0) throw new Exception();
    }

    public ForCustomExceptionInInitialize(int d) throws MyInitializeException {
        if (d == 0) {
            throw new MyInitializeException();
        }
        a = 3 / d;
    }
    public ForCustomExceptionInInitialize() throws Exception {
        throw new Exception();
    }
}
