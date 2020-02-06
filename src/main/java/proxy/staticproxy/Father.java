package proxy.staticproxy;

import proxy.Person;

/**
 * 父亲充当代理类 帮助孩子找对象
 */
public class Father implements Person {

    private Person person;

    public Father(Son son){
        this.person=son;
    }
    //大家每天都在用的一种静态代理的形式
    //对数据库进行分库分表
    //ThreadLocal
    //进行数据源动态切换
    public void findlove() {
        System.out.println("父亲物色对象");
        this.person.findlove();
        System.out.println("双方父母同意，确立关系");
    }

}
