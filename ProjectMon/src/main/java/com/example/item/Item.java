package com.example.item;

public class Item {

    private int code;

    public Item(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(Item item) {
        this.code = item.code;
    }
}
