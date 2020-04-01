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
        Collections.addAll(useCases,47,48,49,50);
        System.out.println(useCases);
        trackUseCase(useCases,PasswordUtils.class);

    }


    private static void trackUseCase(List<Integer> useCases, Class<?> cl) {
        for(Method m :cl.getDeclaredMethods()){
            UserCase uc = m.getAnnotation(UserCase.class);
            if (uc != null){
                System.out.println(uc.id() +":::"+ uc.description());
            }
            useCases.remove(new Integer(uc.id()));
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
}
