package DAY1;


import java.util.concurrent.atomic.DoubleAccumulator;

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
*    浮点型：float/double
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
        //1.整型：byte(1字节=8bit)\shout(2字节)\int(4字节)\long(8字节)
        //①byte范围：-128~ 127
        byte b1 = 12;
        byte b2 = -128;
        //b2 = 128;//编译不通过
        System.out.println(b1);
        System.out.println(b2);
        //②long型变量必须以"l"或"L"结尾
        //③通常，定义整型变量时，使用int型
        short s1 = 12;
        int i1  = 1234;
        long l1 = 2132453L;
        System.out.println(l1);

        //2. 浮点型：float(4字节)/double(8字节)
        //①浮点型，表示带小数点的数值
        //②float表示数值的范围比long还大

        double d1 = 123.3;
        System.out.println(d1+1);

        double f1 = (float) (float) 12.3F;
        System.out.println(d1+1);
        //③定义float类型变量时，变量要以"f"或"F"结尾
        float f2 = 12.3f;
        System.out.println(f2);
        //④通常，定义浮点型变量时，使用double型。

        //3.字符型char(1字符=2字节)
        //①定义char型变量，通常使用一对'',内部只能写一个字符
        char c1 = 'a';
        //
        //c1="AB"
        System.out.println(c1);
        char c2 =  '1' ;
        char c3 = '中';
        char c4 = 'A';

        //②表示方式：1.声明一个字符 2.转义字符
        char c5 = '\n';//换行符
        c5 = '\t';//制表符
        System.out.println("hellow"+c5);
        System.out.println("world");

        char c6 = '\u0043';
        System.out.println(c6);

        //4.布尔型：boolean
        //①只能取两个值之一给
        //③常常在条件判断、循环结构中使用
        boolean bb1 = true;
        System.out.println(bb1);

        boolean isMarried = true;
        if (isMarried) {
            System.out.println("你就不能参加单身派队了！\n很遗憾");
        }else {
            System.out.println("你可以多谈谈女朋友");

        }
    }
}
/*
* 基本数据类型之间的运算规则：
* 前提： 这里讨论只是7种数据类型变量间的运算。不包括boolean类型的。
* 1.自动类型提升：
* 结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型
* byte、char、short--> int -->long -->float -->double
* 特别的：当byte、char、short三种类型的变量做运算时，结果为int型
* 2.强制类型转换：自动类型提升运算的逆运算。
* ①需要使用强转符（）
* ②注意点：强制类型转换，可能导致精度损失。
*
*说明：此时的容量大小指的是，表示数范围的大和小。比如：float容量要大于long的容量
*
* */
class VariableTest2{
    public static void main(String[]args){
        byte b1=2;
        int i1=129;
        //编译不通过
        //byte b2= b1+i1;
        int i2=b1+i1;
        long l1=b1+i1;
        System.out.println(i2);
        System.out.println("Hellow world!");
        float f = b1+i1;
        System.out.println(f);
        short s1=123;
        double d1=s1;
        System.out.println(d1);//123.0
        //**********
        char c1='a';//97
        int i3=10;
        int i4=c1+i3;
        System.out.println(i4);
        short s2=10;
        //char c2 =c1+s2;//编译不通过
        byte b2=10;
        //char c3=c1+b2;//编译不通过
        //short s3=b2+s2;//编译不通过
        //short s4=b1+b2;//编译不通过
        //************



    }
}
class VariableTest3{
    public static void main(String[]args){
        double d1=12.3;
        int i1 = (int)d1;//截断操作
        System.out.println(i1);
        //没有精度损失
        long l1= 123;
        short s2=(short) l1;
        //精度损失举例2
        int i2= 128;
        byte b =(byte) 12;
        System.out.println(b);//-128
    }
}
class VariableTest4{
    public static void  main(String[]args){
        //编码情况：
        long l=123123;
        System.out.println(l);
        //编译失败：过大的整数
        //long  l1=22165421531;
        long l1=122341654564l;



        //************
        //编译失败
        //float f1=12.3;

        //2.编码情况2；
        //整型常量，默认类型为int型
        //浮点型常量，默认类型为double型
        byte b =12;
        //byte b1=b+1;//编译失败
        //float f1=b+12.3;//编译失败

    }
}
/*
*String类型变量的使用
* 1.String属于引用数据类型
*2.声明String类型变量时，使用一对""
*3.String可以和8种基本数据类型变量做运算，且运算只能是连接运算：+
*4.运算结果仍然是String类型
*
*
* */
class StringTest{
    public static void main(String[]args){
        String s1 = "Hellow World!";
        System.out.println(s1);
        String s2= "a";
        String S3= "";
        //char c=' ';//编译不通过
        //************
        int number = 1001;
        String numberStr="学号：";
        String info = numberStr+number;//+:连接运算
        boolean b1=ture;
        String info1=info+b1;//+:连接运算
        System.out.println(info);
        //**************
        //练习1
        char c = 'a';
        int num=10;
        String str = "hello";
        System.out.println(c + num + str );//107hello
        System.out.println(c + str + num );//a hello10
        System.out.println(c + (num + str) );//a10hello
        System.out.println((c + num) + str );//107hello
        System.out.println(str + num + c );//hello10a

       //练习2
        //*   *
        System.out.println("*   *");//对
        System.out.println('*'+'\t'+'*');//错
        System.out.println('*'+"\t"+'*');//对
        System.out.println('*'+'\t'+"*");//错
        System.out.println('*'+('\t'+"*"));//对


    }
}













