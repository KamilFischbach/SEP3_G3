﻿namespace Domain.Classes;

public class OpeningHours
{

    public OpeningHours(MyTime mondayOpeningHours, MyTime mondayClosingHours, MyTime tuesdayOpeningHours,
        MyTime tuesdayClosingHours, MyTime wednesdayOpeningHours, MyTime wednesdayClosingHours,
        MyTime thursdayOpeningHours, MyTime thursdayClosingHours, MyTime fridayOpeningHours, MyTime fridayClosingHours,
        MyTime saturdayOpeningHours, MyTime saturdayClosingHours, MyTime sundayOpeningHours, MyTime sundayClosingHours,
        int id, User user, bool isMondayOpen,bool isTuesdayOpen, bool isWednesdayOpen, bool isThursdayOpen, bool isFridayOpen, bool isSaturdayOpen, bool isSundayOpen)
    {
        MondayOpeningHours = mondayOpeningHours;
        MondayClosingHours = mondayClosingHours;
        TuesdayOpeningHours = tuesdayOpeningHours;
        TuesdayClosingHours = tuesdayClosingHours;
        WednesdayOpeningHours = wednesdayOpeningHours;
        WednesdayClosingHours = wednesdayClosingHours;
        ThursdayOpeningHours = thursdayOpeningHours;
        ThursdayClosingHours = thursdayClosingHours;
        FridayOpeningHours = fridayOpeningHours;
        FridayClosingHours = fridayClosingHours;
        SaturdayOpeningHours = saturdayOpeningHours;
        SaturdayClosingHours = saturdayClosingHours;
        SundayOpeningHours = sundayOpeningHours;
        SundayClosingHours = sundayClosingHours;

        IsMondayOpen = isMondayOpen;
        IsTuesdayOpen = isTuesdayOpen;
        IsWednesdayOpen = isWednesdayOpen;
        IsThursdayOpen = isThursdayOpen;
        IsFridayOpen = isFridayOpen;
        IsSaturdayOpen = isSaturdayOpen;
        IsSundayOpen = isSundayOpen;
        
        Id = id;
        User = user;
    }

    public OpeningHours()
    {
    }

    public int Id { get; set; }
    public MyTime MondayOpeningHours { get; set; }
    public MyTime MondayClosingHours { get; set; }
    public MyTime TuesdayOpeningHours { get; set; }
    public MyTime TuesdayClosingHours { get; set; }
    public MyTime WednesdayOpeningHours { get; set; }
    public MyTime WednesdayClosingHours { get; set; }
    public MyTime ThursdayOpeningHours { get; set; }
    public MyTime ThursdayClosingHours { get; set; }
    public MyTime FridayOpeningHours { get; set; }
    public MyTime FridayClosingHours { get; set; }
    public MyTime SaturdayOpeningHours { get; set; }
    public MyTime SaturdayClosingHours { get; set; }
    public MyTime SundayOpeningHours { get; set; }
    public MyTime SundayClosingHours { get; set; }
    public User User { get; set; }
    
    public bool IsMondayOpen { get; set; }
    
    public bool IsTuesdayOpen { get; set; }
    
    public bool IsWednesdayOpen { get; set; }

    public bool IsThursdayOpen
    {
        get;
        set;
    }
    
    public bool IsFridayOpen { get; set; }
    
    public bool IsSaturdayOpen { get; set; }
    
    public bool IsSundayOpen { get; set; }


}