﻿namespace Domain.Classes;

public class MyTime
{
    public int Hour { get; set; }
    public int Minutes { get; set; }

    public MyTime(int hour, int minutes)
    {
        Hour = hour;
        Minutes = minutes;
    }

    public String toString()
    {
        String s = "";
        s += Hour;
        s += ":";
        if (Minutes < 10)
        {
            s += "0";
        }

        s += Minutes;
        return s;
    }
}