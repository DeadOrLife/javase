package com.wz.deadorlife.annotation.database;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wz
 */
public class TableCreator {

    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length < 1){
            System.out.println("arguments : annotated classes");
            //终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止。
            System.exit(0);
        }

        for(String className :args){
            //返回与带有给定字符串名的类或接口相关联的 Class 对象。
            Class<?> cl = Class.forName(className);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if (dbTable == null){
                System.out.println("NO DBTable annotations in calss "+ className);
                continue;
            }
            String tableName = dbTable.name().substring(dbTable.name().lastIndexOf(".")+1);
            //if the name is empty ,use the class name
            if (tableName.length()<1){
                //以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称。
                tableName = (cl.getName().substring(cl.getName().lastIndexOf(".")+1)).toUpperCase();
                List<String> columnDefs = new ArrayList<String>();
                for(Field field :cl.getDeclaredFields()){
                    String columnName = null;
                    Annotation[] anns = field.getAnnotations();
                    if (anns.length<1){
                        continue;
                    }
                    if (anns[0] instanceof SQLInteger){
                        SQLInteger sInt = (SQLInteger)anns[0];
                        //use field name if not specified
                        if (sInt.name().length()<1){
                            columnName = field.getName().toUpperCase();
                        }else{
                            columnName = sInt.name();
                        }
                        columnDefs.add(columnName+" INT"+getConstraints(sInt.constraints()));
                    }

                    if(anns[0] instanceof  SQLString){
                        SQLString sString = (SQLString)anns[0];
                        if (sString.name().length()<1){
                            columnName = field.getName().toUpperCase();
                        }else{
                            columnName = sString.name();
                        }
                        columnDefs.add(columnName+" VARCHAR("+sString.value()+")"+getConstraints(sString.constraints()));
                    }
                }
                StringBuilder createCommand =  new StringBuilder("CRATE TABLE "+tableName+
                        "(");
                for (String columDef: columnDefs) {
                    createCommand.append("\n "+columDef+",");
                }
                String tableCreate = createCommand.substring(0,createCommand.length()-1)+");";
                System.out.println("Table Creation SQL for"+className+"is:\n"+tableCreate);
            }
        }
    }
    private static String getConstraints(Constraints con){
        String constraints ="";
        if (!con.allowNull()){
            constraints += " NOT NULL";
        }else if(con.primarykey()){
            constraints += " PRIMARY KEY";
        }else if(con.unique()){
            constraints += " UNIQUE";
        }
        return constraints;
    }



}
