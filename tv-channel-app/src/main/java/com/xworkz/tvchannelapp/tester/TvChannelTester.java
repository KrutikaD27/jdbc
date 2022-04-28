package com.xworkz.tvchannelapp.tester;

import com.xworkz.tvchannelapp.dao.TvChannelDAO;
import com.xworkz.tvchannelapp.entity.TvChannel;
import com.xworkz.tvchannelapp.impl.TvChannleDAOImpl;

public class TvChannelTester {
	public static void main(String[] args) {
		TvChannel channel=new TvChannel();
		channel.setChannelId(2);
		channel.setChannelName("chandan");
		channel.setLanguage("Kannada");
		channel.setPrice(0);
		channel.setFree(true);
		
		TvChannelDAO channelDAO= new TvChannleDAOImpl();
//		channelDAO.saveChannel(channel);
//		System.out.println("saved successfully");
		channelDAO.getChannel();
		System.out.println("successfully fetched data");
	}
}
