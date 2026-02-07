package com.gqt.encapsulations;

class Demo {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}

public class Program28 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.setMsg("Encapsulation Working");
        System.out.println(d.getMsg());
    }
}
