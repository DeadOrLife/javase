package com.wz.deadorlife.annotation.database;

/**
 * 如果程序员的注解中定义了名为value的元素，并且在应用该注解的时候
 * 如果该元素是唯一需要赋值的元素,那么此时无需使用键值对的这种语法
 * 例如@SQLString(30)
 *
 * 注解不支持继承
 *
 * @author wz
 */
@DBTable
public class Member {

    @SQLString(30)
    String firstName;

    @SQLString(40)
    String lastName;

    @SQLInteger
    Integer age;

    @SQLString(value = 30,constraints = @Constraints(primarykey = true))
    String handle;

    static int memberCount;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getHandle() {
        return handle;
    }

    public static int getMemberCount() {
        return memberCount;
    }

//    @Override
//    public String toString() {
//        return "Member{" +
//                "handle='" + handle + '\'' +
//                '}';
//    }

    public static void main(String[] args) throws ClassNotFoundException {
        TableCreator.main(new String[]{"com.wz.deadorlife.annotation.database.Member"});
    }
}
