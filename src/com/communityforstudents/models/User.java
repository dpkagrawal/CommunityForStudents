package com.communityforstudents.models;

import java.io.Serializable;
import java.util.ArrayList;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class User extends Model implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "user_id")
	Integer userId;

	@Column(name = "user_name")
	String userName;

	@Column(name = "email")
	String email;
	
	@Column(name = "group")
	Groups group;
	
	@Column(name = "notes")
	ArrayList<Notes> notes;
	 
	public User() {
		super();
	}
}
