package com.kary.entitys;

public class Classes {
    private Integer id;

    private String cname;//类别名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

	@Override
	public String toString() {
		return "Classes [id=" + id + ", cname=" + cname + "]";
	}
    
}