package com.wz.deadorlife.annotation.database;

/**
 * @author wz
 */
public class TableCreator2 {

    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length<1){
            System.exit(0);
        }

        for (String className : args){
            //1.获取类对象
            Class<?> cl = Class.forName(className);
            //2.获取类中的指定注解
            DBTable dbTable = cl.getAnnotation(DBTable.class);

            if (dbTable == null){
                System.out.println("该类不存在改注解");
                continue;
            }
            //3.存在改注解 则获取他的name 如果没有 则取 类名
            String tableName = dbTable.name().substring(dbTable.name().lastIndexOf(".")+1);
            if (dbTable.name().length()<1){


            }

        }

    }
}
