package com.example.tugas5_audioquran;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response{

	@SerializedName("chapters")
	private List<ChaptersItem> chapters;

	public List<ChaptersItem> getChapters(){
		return chapters;
	}

	@Override
 	public String toString(){
		return 
			"chapter_info{" +
			"chapters = '" + chapters + '\'' + 
			"}";
		}
}