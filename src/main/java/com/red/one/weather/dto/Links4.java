package com.red.one.weather.dto;

public class Links4 {
    private First first;
    private Self4 self;
    private Next next;
    private Last last;

    public First getFirst() {
        return first;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    public Self4 getSelf() {
        return self;
    }

    public void setSelf(Self4 self) {
        this.self = self;
    }

    public Next getNext() {
        return next;
    }

    public void setNext(Next next) {
        this.next = next;
    }

    public Last getLast() {
        return last;
    }

    public void setLast(Last last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Links4{" +
                "first=" + first +
                ", self=" + self +
                ", next=" + next +
                ", last=" + last +
                '}';
    }
}
