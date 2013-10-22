package com.communityforstudents.models;

import java.io.Serializable;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class Notes extends Model implements Serializable{

	@Column(name = "note_id")
	Integer noteId;
	
	@Column(name = "title")
	String title;
	
	@Column(name = "noteUrl")
	String noteUrl;
}
