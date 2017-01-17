package com.avatar.dao;

import java.util.List;

import com.avatar.model.Friends;



public interface FriendDAO {

	public boolean sendFriendRequest(Friends friend);
	
	public boolean confirmRequest(String fromUser, String toUser);
	
	public boolean checkAlreadyFriendStatus(String fromUser, String toUser);
	
	public boolean updateUnFollow(String fromUser, String toUser);
	
	public List<Friends> viewFriends(String userName);
	
	public List<Friends> viewRequestedUsers(String userName);

}
