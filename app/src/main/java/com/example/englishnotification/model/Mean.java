package com.example.englishnotification.model;

public class Mean {
    public int id;
    public Type type;
    public String meanWord;

    public Mean(int id, String meanWord) {
        this.id = id;
        this.meanWord = meanWord;
    }

    public Mean(int id, Type type, String meanWord) {
        this.id = id;
        this.type = type;
        this.meanWord = meanWord;
    }
}
