package com.wz.deadorlife.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wz
 */
public class UseCaseTracker {

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        //将所有指定元素添加到指定 collection 中
        Collections.addAll(useCases,47,48,49,50);
        System.out.println(useCases);
        trackUseCase(useCases,PasswordUtils.class);
        trackUseCaseAgain(useCases,PasswordUtils.class);

    }


    private static void trackUseCase(List<Integer> useCases, Class<?> cl) {
//        返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，
//        包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
        for(Method m :cl.getDeclaredMethods()){
//            如果存在该元素的指定类型的注释，则返回这些注释，否则返回 null。
            UserCase uc = m.getAnnotation(UserCase.class);
            if (uc != null){
                System.out.println(uc.id() +":::"+ uc.description());

                useCases.remove(new Integer(uc.id()));
            }


        }

        for (int i: useCases) {
            System.out.println("Warning Missing use case-"+i);
        }
//        [47, 48, 49, 50]
//        49:::NEW password can't equal previously used ones
//        47:::password must contain at least one
//        48:::no description
//        Warning Missing use case-50
    }


    private static void trackUseCaseAgain(List<Integer> useCases, Class<?> cl){
        //获取PasswordUtils中的所有方法
        for(Method m : cl.getDeclaredMethods()){
            //获取注解信息
            UserCase u = m.getAnnotation(UserCase.class);
            if (u != null){
                System.out.println(u.id()+":::"+u.description());

                useCases.remove(new Integer(u.id()));
            }
        }
        System.out.println(useCases);
    }


}
