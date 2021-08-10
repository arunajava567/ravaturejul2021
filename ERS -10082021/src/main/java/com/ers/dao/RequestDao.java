package com.ers.dao;

import java.util.List;

public interface RequestDao {
	 public List<Integer> displayAllRequests();
	 public void updateRequest(Integer rid,String status) ;
}
