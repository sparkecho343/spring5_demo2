package com.atguigu.spring5.collectiontype;

import java.util.List;

/**
 * @author kasio
 * @create 2021-10-28 0:24
 */
public class Book {

    private List<Course> list;
    public void setList(List<Course> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
