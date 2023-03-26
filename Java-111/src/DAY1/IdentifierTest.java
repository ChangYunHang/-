package DAY1;

;
/*
* 标识符的使用
* 1.标识符：凡是自己命名的都叫标识符。比如：类名,方法名，接口名，包名...
* 2.标识符的命名规则：-->如果不遵守如下规则，编译不通过。必须遵守。
* >由26个英文字母大小写，0-9，-或$组成
* >数字不可以开头
* >不可以使用关键字或者保留字，但能包含关键字和保留字。
* >Java中严格区分大小写，长度无限制
* >标识符中不能有空格
* 3.命名的规范：-->如果不遵守如下规则，编译可以通过。，建议遵守。
* >包名：多单词组成时所有字母都小写：xxxyyyxxx
* >类名，接口名：多单词组成时，所以单词的首字母大写：XxYyZz
* >变量名，方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
* >常量名：所有字母都大写，多个单词用下划线连接：XX_YY_ZZ
* 4.注意1.起名字时，为了提高阅读性，要尽量有意义，见名思意
* 注意2.
*
*
*
*
* */
public class IdentifierTest {
    public static  void  main(String[]args){
        //int myNumber = 1001;
        //System.out .println(myNumber);
        int mynumber = 1001;
        System.out .println(mynumber);

    }

}
class  Hello1_$
{
}

//class  1Hollo{
//        }

class staticpublic{

}

class Static{

        }
/*
变量的使用：
1.Java定义的变量格式：数据类型 变量名=变量值；
2.变量必须先声明后使用
3.变量都定义在作用域内。在作用域内是有效的。
4.在同一作用域内不能定义重名的变量
 */

class VariableTest{
    public  static  void main(String[]args){
        //变量的定义
        int myAge = 12;
        //变量的使用
        System.out.println(myAge);

        //变量的声明
        int myNumber;
        //变量的赋值
        myNumber = 1001;
        System.out.println(myNumber);
    }
}
/*
* Java定义的数据类型
* 一.变量按照数据类型来分
*    基本数据类型：byte /short/int /long
*    浮夸型：float/double
*    字符型：char
*    布尔型：boolea
*
*   引用数据类型：
*   类（class）
*   接口(interface)
*   数组(array)
*
* 二、变量在类中声明的位置：
*    成员变量vs局部变量
*
* */
class VariableTest1{
    public static void main(String[]args){
        System.out.println("Hello word");
    }
}















