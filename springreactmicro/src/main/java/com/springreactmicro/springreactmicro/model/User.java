package com.springreactmicro.springreactmicro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
        @Id
        @GeneratedValue
	    private Integer id;
	    private String name;
	    private String username;
	    private String email;
	    private String phone;
	    private String website;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}

	   
	}

	