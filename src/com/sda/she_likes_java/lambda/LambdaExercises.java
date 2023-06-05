package com.sda.she_likes_java.lambda;

public class LambdaExercises {

    public static void main(String[] args) {
        Jogging slowMan = new SlowRunner();
        Jogging fastMan = new FastRunner();

        justRun(slowMan);
        justRun(fastMan);

        //anonymous classes - till java 7
        Jogging middleOne = new Jogging() {
            @Override
            public void run() {
                System.out.println("I am ok at running");
            }
        };
        justRun(middleOne);
        Jogging firstLambda = ( )->{};
        Jogging secondLambda = () -> {
            System.out.println("Run from lambda");
        };
        secondLambda.run();

    }
    public static void justRun(Jogging runner){
        runner.run();
    }
}
