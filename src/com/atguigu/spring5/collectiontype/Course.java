package com.atguigu.spring5.collectiontype;

/**
 * @author kasio
 * @create 2021-10-28 0:12
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
