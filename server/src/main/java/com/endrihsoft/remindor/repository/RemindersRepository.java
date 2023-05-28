package com.endrihsoft.remindor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endrihsoft.remindor.model.Reminder;

public interface RemindersRepository extends  JpaRepository<Reminder, Long>{
    
}
