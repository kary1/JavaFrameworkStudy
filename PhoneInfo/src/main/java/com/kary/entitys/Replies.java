package com.kary.entitys;

import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;

public class Replies {
    private Integer id;

    private String content;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp replytime;

    private Integer inflod;

    
    public Replies() {
		super();
	}

	public Replies(Integer id, String content, Timestamp replytime, Integer inflod) {
		super();
		this.id = id;
		this.content = content;
		this.replytime = replytime;
		this.inflod = inflod;
	}

	public Replies(String content, Integer inflod) {
		super();
		this.content = content;
		this.inflod = inflod;
	}

	public Replies(String content, Timestamp replytime, Integer inflod) {
		super();
		this.content = content;
		this.replytime = replytime;
		this.inflod = inflod;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Timestamp getReplytime() {
        return replytime;
    }

    public void setReplytime(Timestamp replytime) {
        this.replytime = replytime;
    }

    public Integer getInflod() {
        return inflod;
    }

    public void setInflod(Integer inflod) {
        this.inflod = inflod;
    }

	@Override
	public String toString() {
		return "Replies [id=" + id + ", content=" + content + ", replytime="
				+ replytime + ", inflod=" + inflod + "]";
	}
    
    
}