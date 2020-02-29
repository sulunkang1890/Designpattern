package com.slk.payfactory;


import org.springframework.beans.BeanUtils;

public class PayTest {

    public static void main(String[] args) {
//         PayFactory payFactory = new AiliPayFactory();
//         IAccount iAccount= payFactory.getAccount();
//         iAccount.pay();
//        String signatureUrl="/cp-contract-signature-pic/8964_授权_1582772024058_5077";
//        String str=signatureUrl.substring(signatureUrl.lastIndexOf("/") + 1);
//        System.out.println(str);
          B a =new B();
          a.setA("1");
          a.setB("2");
          A a1= new A();

          BeanUtils.copyProperties(a,a1);
        System.out.println(a1);

    }
}
