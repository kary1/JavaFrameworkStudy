package com.kary.entitys;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Faqs {
    private Integer id;

    private Integer classid;

    private String content;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdate;

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date  getCreatedate() {
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//    	String format = sf.format(createdate);
        return createdate;
    }
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

	@Override
	public String toString() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    	String format = sf.format(createdate);
		return "Faqs [id=" + id + ", classid=" + classid + ", content="
				+ content + ", createdate=" + format + ", title=" + title
				+ "]";
	}
}