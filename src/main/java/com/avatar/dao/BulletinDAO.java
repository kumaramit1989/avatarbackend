package com.avatar.dao;

import java.util.List;

import com.avatar.model.Bulletin;



public interface BulletinDAO {

	public List<Bulletin> getAllBulletin(char showflag);

	public Bulletin getBulletinByID (int v_bulid);
	
	public boolean saveBulletin(Bulletin bulletin);
}
