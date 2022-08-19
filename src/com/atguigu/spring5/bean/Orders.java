package com.atguigu.spring5.bean;

/**
 * @author kasio
 * @create 2021-10-29 15:51
 */
public class Orders {

    public Orders() {
        System.out.println("第一步，执行无参数构造创建bean实列");
    }

    private String oname;
    public void setOname(String oname){
        this.oname = oname;
        System.out.println("第二步，调用set方法设置属性值");
    }

    //创建执行的初始化的方法
    public void initMethod(){
        System.out.println("第三步，执行初始化的方法");
    }
    //创建执行的销毁的方法
    public void destoryMethod(){
        System.out.println("第五步，执行销毁的方法");
    }
}
