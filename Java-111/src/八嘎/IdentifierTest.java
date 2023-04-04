package 八嘎;


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
        boolean b1=false;
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

/*
* 计算机中不同进制的使用说明
*   对于整数有四种表达方式
* 1.二进制(binary)：0,1,满2进1 ，以0b或者 0B开头
* 2.十进制(decimal)：0-9，满10进1
* 3.八进制(octal)：0-7，满8进1，以数字0开头表示
* 4.十六进制(nex)：0-9及A-F，满16进1，以0x或者0X开头表示。此处A-F不区分大小写。
* 如：0x21AF=1=0X21B0
*
*
* */
class BinaryTest{
    public static void main(String[]args){
        int num1=0b110;
        int num2=110;
        int num3=0127;
        int num4=0x110A;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println("num3="+num3);
        System.out.println("num4="+num4);

    }
}
/*
* 运算符之一：算术运算符
*+-+-* /%   (前)++(后)++(前)--(后)--
*/
class AriTest{
    public static void main(String[]args){
        //除号：/
        int num1=12;
        int num2=5;
        int result1=num1 / num2;
        System.out.println(result1);//2
        int result2=num1 / num2 * num2;
        System.out.println(result2);//10
        double result3 = num1 / num2;
        System.out.println(result3);//2.0
        double result4 = num1 / num2 + 0.0 ;//2.0
        double result5 = num1 / (num2 + 0.0) ;//2.4
        double result6 = (double) num1 / num2;//2.4
        double result7 = (double) (num1 / num2);//2.0
        System.out.println(result5);
        System.out.println(result6);
        //%:取余运算
        //结果符号与被模数的符号相同
        //开发中，经常使用%来判断能否被除尽的情况
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1%n1="+m1%n1);


        int m2 = -12;
        int n2 = 5;
        System.out.println("m2%n2="+m2%n2);


        int m3 = 12;
        int n3 = -5;
        System.out.println("m3%n3="+m3%n3);

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4%n4="+m4%n4);

        //(前)++:先增自1，后运算
        //(后)++：先运算，后自增1
        int a1=10;
        int b1= ++a1;
        System.out.println("a1=" + a1 + ", b1" + b1);

        int a2 =10;
        int b2 = a2++;
        System.out.println("a2=" + a2 + ", b2" + b2);

        int a3 = 10;
        ++a3 ; //a3++
        int b3 = a3;
        //注意点：
        short s1 = 10;
        //s1 = s1+1;编译失败
        //s1 = (short) (s1+1);编译正确
        s1++;//自增1不会改变本身变量的数据类型
        System.out.println(s1);
        //问题
        byte bb1 =127;
        bb1++;
        System.out.println("bb1= "+ bb1);


        // (前)--:先自减1，后运算
        // (后)--:先运算，后自减1

         int a4 =10;
         int b4 = a4++;//int b4= --a4;
        System.out.println("a4 = "+a4 +",b4 = " +b4);

         }
}
class AriExer{
    public static void main(String[]args){
        int num =187;
        int bai = num / 100;
        int shi = num % 100 / 10;//int shi = num / 10% 10;
        int ge = num%10;
        System.out.println("百位为：1");
        System.out.println("十位位为：8");
        System.out.println("个位为：7");
    }
}
/*
*运算符号之二：赋值运算符
* = += -= *= /= %=
*/
class SetValueTest{
    public static void main(String[]args){
        //赋值符号
        int i1=10;
        int j1=10;
        int i2,j2;
        //连续赋值
        i2 = j2 =10;
        int i3 =10, j3 =20;
        //*****************
        int num1 = 10;
        num1 +=2;//num1 = num1 + 2;
        System.out.println(num1);//12

        int num2=12;
        num2 %=5;//num2 = num2 % 5 ;
        System.out.println(num2);

        short s1 = 10;
        //s1 = s1+2;//编译失败
        s1 += 2;//不会改变变量本身的数据类型
        System.out.println(s1);

        //开发中，如果希望实现+2操作，有几种方法？（前提：int num = 10;)
        //方式一：num = num+2;
        //方式二：num +=2;(推荐）

        //开发中，如果希望变量实现+1的操作，有几种方法？（前提：int num = 10;)
        //方式一：num = num + 1;
        //方式二：num += 1;
        //方式三：num++;(推荐)
        int i = 1;
        i *=0.1;
        System.out.println(i);//0
        i++;
        System.out.println(i);//1
        //练习2
        int m=2;
        int n=3;
        n *=m++;//n =n * m++;
        System.out.println("m="+m);//3
        System.out.println("n="+n);//6
        int n1=10;
        n1 +=(n1++) + (++n1);//n1 = (n1++) + (++n1);
        System.out.println(n1);//32


    }
}
/*
* 运算符之三 ：比较运算符
* ==   != >  <   >=  <=  instanceof
*结论：
*1.比较运算符的结果是boolean的类型
* 2.区分 == 和=
* */
class CompareTest{
    public static void main(String[]args){
        int i = 10;
        int j = 20;
        System.out.println(i == j);//false
        System.out.println(i = j);//20

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 == b1);//false
        System.out.println(b2== b1);//ture
    }
}
/*
* 运算符之四：逻辑运算符
* &  &&  |   ||  !  ^
*
* 说明：
* 1.逻辑运算符操作的都是boolean类型的量
*
*/
class LogicTest {
    public static void main(String[] args) {
        //区分&与&&
        //相同点1：&  与   &&的运算结果相同
        //相同点2：当符号左边是true时，二者都会执行符号右边的运算
        //不同点：当符号左边是false时，&继续执行符号右边的运算。&&不再执行符号右边的运算。
        boolean b1 = true;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }

        System.out.println("num1 ="+ num1);


        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }
        System.out.println("num2 ="+ num2);

        //区分： | 与||
        //相同点1：|与||的运算结果相同
        //相同点2：当符号左边是false时，二者都会执行符号右边的运算
        //不同点3：当符号左边是ture时，|继续执行符号右边的运算，而||不再执行符号右边的运算
        //开发中，推荐使用||
        boolean b3 =false;
        b3 = true;
        int num3 = 10;
        if(b3 | (num3++> 0 )){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num3 ="+ num3);

        boolean b4 =false;
        b4 = true;
        int num4 = 10;
        if(b3 || (num4++> 0 )){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num4 ="+ num4);
    }
}
/*
*运算符之五：运算符（了解）
*结论：
* 1.位运算符操作的都是整型的数据
* 2.<<:在一定范围内，每向左移1位，相当于*2
*   >>:在一定范围内，每向右移1位，相当于/2
*/
class   BitTest{
    public static void main(String[]args){
        int i =21;
        i = -21;
        System.out.println("i << 2 :"+ (i << 2));
        System.out.println("i << 3 :"+ (i << 2));
        System.out.println("i << 27 :"+ (i << 27));
    }
}












