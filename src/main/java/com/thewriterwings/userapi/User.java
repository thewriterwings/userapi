package com.thewriterwings.userapi;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name="user_info")
@Data
public class User implements Serializable{

	private static final long serialVersionUID = -2889381404056075272L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column(name="user_name")
	@JsonProperty(value="userName")
	@NonNull
	private String userName;
	
	@Column(name="email")
	@JsonProperty(value="email")
	@NonNull
	private String email;

}
