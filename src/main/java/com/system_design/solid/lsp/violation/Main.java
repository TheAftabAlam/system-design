package com.system_design.solid.lsp.violation;

class Main {
    public static void main(String[] args) {
        Bird bird = new Penguine();
        bird.fly();
    }
}

class Bird{
    public void fly(){
        System.out.println("flying");
    }
}

class Sparrow extends Bird{


}

class Penguine extends Bird{
    public void fly(){
        throw new RuntimeException("penguine cannot fly");
    }
}