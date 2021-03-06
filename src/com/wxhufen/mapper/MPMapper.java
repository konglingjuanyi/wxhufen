package com.wxhufen.mapper;

import java.util.List;
import java.util.Map;

import com.wxhufen.po.MP;
import com.wxhufen.po.Page;


public interface MPMapper {
	public MP selectMPByMPid(String mpid);
	
	public void insertMPid(String mpid);
	
	public void updateMP(MP mp);
	
	public List<MP> selectAllMPItems(Page page);
	
	public Integer getMPCount();
	
	//扣除任务次数
	public void updateMPTotalCountByMPId(String mpid);
	
}
