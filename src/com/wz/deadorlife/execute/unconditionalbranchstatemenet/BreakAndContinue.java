package com.wz.deadorlife.execute.unconditionalbranchstatemenet;

/**
 * java中有多个关键词表示无条件分支，它们只是表示煮这个分支无需任何测试即可发生。
 *
 * 这些关键词包括 return break continue 与goto类似跳转到标号语句的方式
 *
 * return：
 * 1.一方面指定一个方法返回什么值
 * 2.一方面它会导出当前方法退出，并返回那个值
 *
 * 如果void方法没有return语句，那么在该方法的结尾处会有一个隐式的return
 * @author wz
 */
public class BreakAndContinue {

    public static void main(String[] args) {
        //brak 与 continue在循环中的用法
        for (int i = 0; i < 100; i++){
            if (1 == 74) {
                break;
            }
            //只要i不能整除9的 都执行continue
            if(i % 9 != 0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        int i = 0;
        while (true){
            i++;
            int j = i * 27;
            if (j == 1269){
                break;
            }
            if (j % 10 != 0){
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
