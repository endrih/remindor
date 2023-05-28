package com.endrihsoft.remindor.model;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Reminder {
    private @Id @GeneratedValue Long id;
    private String reminderTitle;
    private Date initialStartDate;
    private Long intervalBetweenExecutions;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getReminderTitle() {
        return reminderTitle;
    }
    public void setReminderTitle(String reminderTitle) {
        this.reminderTitle = reminderTitle;
    }
    public Date getInitialStartDate() {
        return initialStartDate;
    }
    public void setInitialStartDate(Date initialStartDate) {
        this.initialStartDate = initialStartDate;
    }
    public Long getIntervalBetweenExecutions() {
        return intervalBetweenExecutions;
    }
    public void setIntervalBetweenExecutions(Long intervalBetweenExecutions) {
        this.intervalBetweenExecutions = intervalBetweenExecutions;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (!(obj instanceof Reminder))
            return false;
        Reminder reminder = (Reminder) obj;
        return Objects.equals(reminder.id, this.id) && Objects.equals(reminder.reminderTitle, this.reminderTitle) 
        && Objects.equals(reminder.intervalBetweenExecutions, this.intervalBetweenExecutions) && 
        Objects.equals(reminder.initialStartDate, this.initialStartDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.initialStartDate, this.reminderTitle, this.intervalBetweenExecutions);
    }

    @Override
    public String toString() {
        return "Reminder { id= "+ this.id + "}, reminderTitle= " + this.reminderTitle + "}";
    }
    
    
}
