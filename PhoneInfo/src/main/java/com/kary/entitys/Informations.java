package com.kary.entitys;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Informations {
    private Integer id;

    private String title;

    private String content;

    private Integer replycount;

    private Integer viewcount;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp reporttime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp lastposttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getReplycount() {
        return replycount;
    }

    public void setReplycount(Integer replycount) {
        this.replycount = replycount;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Timestamp getReporttime() {
        return reporttime;
    }

    public void setReporttime(Timestamp reporttime) {
        this.reporttime = reporttime;
    }

    public Date getLastposttime() {
        return lastposttime;
    }

    public void setLastposttime(Timestamp lastposttime) {
        this.lastposttime = lastposttime;
    }

	@Override
	public String toString() {
		return "Informations [id=" + id + ", title=" + title + ", content="
				+ content + ", replycount=" + replycount + ", viewcount="
				+ viewcount + ", reporttime=" + reporttime + ", lastposttime="
				+ lastposttime + "]";
	}
    
}