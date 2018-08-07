package com.example.programmer.mvvmscore.model;

/**
 * Created by Kamil on 2018-08-07.
 */
public class Response {
    public Value[] values;

    public String text;

    public Value[] getValues ()
    {
        return values;
    }

    public void setValues (Value[] values)
    {
        this.values = values;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [values = "+values+"]";
    }
}
