package com.shuffled;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWIthSets {
    public static void main(String[] args) {
        Set<Ball> balls=new HashSet<>();
        balls.add(new Ball("yellow"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("red"));
        System.out.println(balls);
        System.out.println(balls.size());
        balls.forEach(System.out::println);

    }
//    record Ball(String colour){}
    static class Ball{
        String colour;
        public Ball(String colour){
            this.colour=colour;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(colour, ball.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(colour);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
}
