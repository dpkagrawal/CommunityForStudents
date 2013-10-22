package com.communityforstudents.models;

import java.io.Serializable;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class Groups extends Model implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "group_id")
	String groupId;

	@Column(name = "group_name")
	String groupName;

}
