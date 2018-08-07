package com.example.programmer.mvvmscore.model;

/**
 * Created by Kamil on 2018-08-07.
 */
public class Avatar
{
    private String href;

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [href = "+href+"]";
    }
}