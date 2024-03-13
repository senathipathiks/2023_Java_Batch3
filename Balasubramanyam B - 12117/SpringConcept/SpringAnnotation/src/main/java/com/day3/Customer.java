package com.day3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Customer {
        int id;
        @Autowired  
        private Person person;
          
		public Customer() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
		void display() {
			 System.out.println(id);
			 System.out.println(person);
		 }   
}
