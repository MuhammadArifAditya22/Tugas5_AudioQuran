package com.example.tugas5_audioquran;

import com.google.gson.annotations.SerializedName;

public class ChapterInfoq {
    @SerializedName("id")
    private int id;
    @SerializedName("chapter_id")
    private int chapterId;
    @SerializedName("language_name")
    private String languageName;
    @SerializedName("short_text")
    private String shortText;
    @SerializedName("source")
    private  String source;
    @SerializedName("text")
    private  String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
