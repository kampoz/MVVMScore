package com.example.programmer.mvvmscore.model;

/**
 * Created by Kamil on 2018-08-07.
 */
public class Value
{
    private String description;

    private String name;

    private Owner owner;

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Owner getOwner ()
    {
        return owner;
    }

    public void setOwner (Owner owner)
    {
        this.owner = owner;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [description = "+description+", name = "+name+", owner = "+owner+"]";
    }
}
