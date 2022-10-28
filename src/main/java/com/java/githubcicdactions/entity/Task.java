package com.java.githubcicdactions.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task implements Serializable{
    
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue
        private Long id;
        private String name;
        private String description;
        private String status;
        
        public Task() {
        }
    
        public Task(String name, String description, String status) {
            this.name = name;
            this.description = description;
            this.status = status;
        }

        public Long getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getDescription() {
            return description;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    
        public String getStatus() {
            return status;
        }
    
        public void setStatus(String status) {
            this.status = status;
        }
    
}
