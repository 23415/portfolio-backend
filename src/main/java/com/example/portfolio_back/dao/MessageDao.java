package com.example.portfolio_back.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.portfolio_back.model.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDao extends JpaRepository<Message, Integer> {
}
