package 八嘎;


import java.util.Scanner;

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

        int m =12;
        int n = 5;
        System.out.println("m & n:" + (m & n));
        System.out.println("m | n:" + (m | n));
        System.out.println("m ^ n:" + (m ^ n));

        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ", num2 =" +num2 );


        //方式一：定义临时方式的变量
        //推荐的方式
        //int temp num1;
        //num1= num2;
        //num2 = temp;

        //方式二：好处：不用定义的临时变量
        //弊端：①相加操作可能超过存储范围 ②有局限性：只能适用于数据类型
        //num1 =num1 + num2;
        //num2= num1 - num2;
        //num1= num1 - num2;


        //方式三：使用位运算符
        //有局限性：只能适用于数值类型
        //num1=num1^num2;
        //num2=num1^num2;
        //num1 = num1^num2;
        System.out.println("num1=" + num1 +", num2=" +num2);
    }
}
/*
*运算符之六：三元运算符
*1.结构：（条件表达式）？表达式1：表达式2
*2说明
*①条件表达式的结果为boolean类型
*②根据条件表达式真或假，决定执行表达式1，还是表达式2。
* 如果表达式为true，则执行表达式1
* 如果表达式为false，则执行表达式2.
* ③表达式1 和表达式②要求是一致的。
* ④三元运算符可以嵌套使用
*
* 3.凡是可以使用三元运算符的地方，都可以改写为if-else
* 反之，不成立。
*
* 4.如果程序既可以使用三元运算符，又可以使用if-else结构，那么优先选择三元运算符。原因：简洁，执行效率高。
*/
class SanYuanTest{
    public static void main(String[]args){

        //获取两个整数的最大值
        int m= 12;
        int n = 5;

        int max =(m > n)? m: n ;
        System.out.println(max);

        double num = (m>n)? 2: 10;
        //（m >n）? 2 : "n大";//编译错误

        //******************
        n = 12;
        String maxStr = (m > n)?"m大" :((m==n)?"m和n相等":"n大");
        System.out.println(maxStr);
        //********************
        //获取三个数的最大值
        int n1 =12;
        int n2 = 30;
        int n3= -43;

        int max1= (n1>n2)? n1: n2;
        int max2=(max1 >n3)? max1: n3;
        System.out.println("三个数中的最大值为：" +max2);


        //不建议
        //int max3= (((n1> n2)? n1: n2) > n3) ? ((n1 > n2)? n1 : n2): n3;
        //System.out.println("三个数中的最大值为："+max3);

        //改写成if-else；
        if(m > n){
            System.out.println(m);

        }else {
            System.out.println(n);
        }
    }
}
/*
*分支结构中的if-else(条件判断结构)
*
* 一、三种结构
*
* 第一种:
* if(条件表达式){
*
* }
*
* 第二种:二选一
* if(条件表达式){
*    执行表达式1
* }else{
*     执行表达式2
* }
*
* 第三种：多选一
* if(条件表达式){
*   执行表达式1
* }else if(条件表达式){
*   执行表达式2
* }else if(条件表达式){
*   执行表达式3
* }
* 。。。。。。
* else{
*   执行表达式n
* }
*
*/
class  IfTest{
    public static void main(String[]args){

        //举例1
        int hearBests = 79;
        if(hearBests < 60 || hearBests >100) {


            System.out.println("需要做进一步检查");

        }
        System.out.println("检查结束");


        //举例2
        int age = 23;
        if (age <18){
            System.out.println("你还可以看动画片");
        }else {
            System.out.println("你可以看海贼王了");
        }


        //举例3
        if(age < 0){
            System.out.println("您输入的数据非法");
        }else  if (age < 18){
            System.out.println("青少年时期");
        }else  if (age < 35){
            System.out.println("青壮年时期");
        }else  if (age < 60){
            System.out.println("中年时期");
        }else  if (age < 120){
            System.out.println("老年时期");
        }else {
            System.out.println("你要成仙啊~~");
        }


    }
}


/*
*如何从键盘获取不同类型的变量：需要使用Scanner类
*
*具体实现步骤：
* 1.导包：import  java.util.Scanner;
* 2.Scanner的实例化：Scanner scan = new Scanner(System.in);
* 3.调用Scanner类的相关方法，来获取指定类型的变量
*
*
* 注意：
* 需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型不匹配时，会报异常：InputMisMatchException导致程序终止
*/


class ScannerTest{
    public static void main(String[]args){
        //2.Scanner的实例化：Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        //3.调用Scanner类的相关方法，来获取指定类型的变量
        System.out.println("请输入你的姓名");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的芳龄");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重：");
        double  weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中我了呢？(true/false)");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        //对于char型的获取，Scanner没有提供相关的方法。只能获取一个字符串
        System.out.println("请输入你的性别：(男/女)");
        String gender = scan.next();//"男"
        char genderChar = gender.charAt(0);//获取索引为0位置上的字符
        System.out.println(genderChar);

    }

}
/*
*越小彭参加Java考试，他和越不群达成承诺
* 如果：
* 成绩为100分时，奖励一台BMW；
*成绩为(80，99]时，奖励一台iPhone xs max;
*当成绩为[60,80]时，奖励一台ipad；
* 其他时，什么奖励也没有
*请从键盘输出越小彭期末成绩，并加以判断
*
*说明：
* 1.else结构是可选的
* 2.针对条件表达式：
* >如果多个条件表达式之间是“互斥”关系（或者没有交集的关系），哪个判断和执行语句声明在上面还是下面。无所谓。
* >如果多个条件表达式之间有交集的关系，需要根据实际的情况，考虑清楚应该将哪个结构声明在上面
* >如果多个条件表达式之间有包含的关系，通常情况下，需要将范围小的声明在范围大的声明上面。否则，范围小的，就没机会执行了
*/
class IfTest2{
    public static void  main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入越小彭的期末成绩：(0-100)");
        int score = scan.nextInt();

        if (score==100){
            System.out.println("奖励一台BMW");//be my wife! BMW <--> MSN
        }else if( score  >80 &&   score<= 99) {
           System.out.println("奖励一台iPhone xs max");
        }else if( score  >60 &&   score<= 80) {
            System.out.println("奖励一台ipad");
        }else {
            System.out.println("什么奖励也没有");


        }
    }
}
/*
*编写程序：由键盘输入三个整数分别存入变量num1,num2,num3,
* 对他们进行排序（使用if - else if-else）,并且从小到大输出
*
*说明：
* 1.if-else结构是可以相互嵌套的
* 2.如果if-else结构中执行语句只有一行时，对应的一对{}是可以省略的。但是，不建议大家省略。
*/
 class IfTest3{
     public static  void main(String[]args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("请输入第一个整数：");
         int num1 = scanner.nextInt();
         System.out.println("请输入第二个整数：");
         int num2 = scanner.nextInt();
         System.out.println("请输入第三个整数：");
         int num3 = scanner.nextInt();

         if(num1 >= num2) {
             if (num3 >= num1) {
                 System.out.println(num2 + "," + num1 + "," + num3);
             } else if (num3 <= num2) {
                 System.out.println(num3 + "," + num2 + "," + num1);
             } else {
                 System.out.println(num2 + "," + num3 + "," + num1);
             }
         }else {
             if (num3 >= num2){
                 System.out.println(num1 + "," + num2 + "," + num3);
             }else if(num3 <= num1){
                 System.out.println(num3 + "," + num1 + "," + num2);
             }else if(num3 <= num1){
                 System.out.println(num1 + "," + num3 + "," + num2);

             }

         }
     }
}
class  IfExer{
     public static  void  main(String[]args){
         int x = 4;
         int y = 1;
         if ( x > 2)
         if ( y > 2)
             System.out.println( x + y);
          //System.out.println("atguigu");
         else//就近原则
         System.out.println("x is " +x);

         //课后练习3：测量狗的年龄
         int dogAge = 6;
         if(dogAge >=0 && dogAge <=2) {
             System.out.println("相当于人的年龄：" + dogAge * 10.5);
         }else if(dogAge >2){
             System.out.println("相当于人的年龄：" + (2* 10.5 + (dogAge - 2) * 4));
         }else{
             System.out.println("狗狗还没出生呢！");

         }


     }
}

class  IfExer1 {
     public static void  main(String[]args){
         Scanner scan = new Scanner(System.in);

         System.out.println("请输入你的身高：（cm）");
         int height = scan.nextInt();
         System.out.println("请输入你的财富：（千万）");
         double wealth = scan.nextDouble();
         System.out.println("请输入你是否帅：（ture/false）");
         boolean isHandsome = scan.nextBoolean();

         if(height >= 180 && wealth >= 1 && isHandsome){
             System.out.println("我一定要嫁给他！！！");
         }else if(height >=180 || wealth >=1 ||isHandsome) {
             System.out.println("嫁吧，比上不足，比下有余。");
         }else{
             System.out.println("不嫁！");
         }
     }
}

/*
*分支结构之二：switch-case
* 1.格式
* switch(表达式){
* case 常量1：
*    执行语句1；
*    //break；
*
* ......
*
* default:
*  执行语句n;
*  //break;
*
* }
*
* 2.说明:
* ①根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功，则进入相应case结构中，调用其执行语句。
* 当调用完执行语句以后，则仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此switch-case结构
* 末尾结束为止.
* ②break，可以使用在switch-case结构中，表达一旦执行到此关键字，就跳出switch-case结构
* ③switch结构中表达式，只能是以下六种数据类型之一：
* byte、short、char、int、枚举类型、String类型(JDK7.0新增)
* ④class只能声明常量。不能声明范围。
* ⑤break关键字是可选的。
* ⑥default:相当于if-else结构中的else.
* default结构是可选的，而且位置是灵活的。
*/
class SwitchCaseTest{
    public static void main (String[]args){
        int number = 2;
        switch (number){

            case  0:
                System.out.println("zero");
                break;
            case  1:
                System.out.println("one");
                break;
            case  2:
                System.out.println("two");
                break;
            case  3:
                System.out.println("three");
                break;

            default:
                System.out.println("other");
        }

        //*******************************
        String season = "summer";
        switch (season){
            case "spring":
            System.out.println("春暖花开");
            break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("季节输入错误");
                break;

        }
    }

}

/*
例题：对学生成绩大于60分的，输出”合格“。低于60分的，输出“不合格”。
说明：如果switch-case结构中的多个case的执行语句相同，则可以考虑进行合并。

*/

class SwitchCaseTest1 {
    public static void main(String[] args) {
        /*
        int score= 78;
        switch (score){
            case 0:
            case 1:
                case 2:
                    ....
            case 100:

        }

         */

        int score = 78;
        switch (score / 10) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;


        }
    }
}
/*
编写程序：从键盘上输入2019的"month"和"day"，要求通过程序输出的日期为2019的第几天
2  15：  31  +  15
5  7 ： 31 +28 + 31 + 30 + 7
...
*/
class SwitchCaseTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入2019年的month:");
        int month = scan.nextInt();
        System.out.println("请输入2019年的day");
        int day = scan.nextInt();

        //定义一个变量来保存天数
        //方式一：
        /*
        int sumDays = 0;
        if(month == 1){
            sumDays = day;
        }else if(month == 2){
            sumDays = 31 + day;
        }else if (month == 3){
            sumDays = 31 + 28+ day;
        }else if(month == 4){
            sumDays = 31 +28 +31 +day ;
        }
        //。。。
        else {//month=12
              //sunDays=...+day
              }
         */

        //方式二：
        /*
        switch (month){
            case 1:
                sumDays = day;
                break;
            case 2:
                sumDays = 31 + day;
            case 3:
                sumDays = 31 + day;
                break;
            ...

         */

        }

    }


/*
For循环结构的使用
一、循环结构的4个要素
①初始化条件
②循环条件
③循环体
④迭代条件

二、For循环的结构

for(①；②；④){
     ③
}

执行过程: ① - ② - ③ - ④ - ② - ③ - ④ - ... - ②

*/
class ForTest{
    public static void main(String[]args){
        /*
        *System.out.println("ok");
        *System.out.println("ok");
        *System.out.println("ok");
        */
        for(int i = 1;i <= 5000; i++){//i:1,2,3,4,5
            System.out.println("ok");
        }
        //i:在for循环内有效。出了for循环就失效了。
        //System.out.println(i);




        //练习
        int num = 1;
        for(System.out.println('a');num <= 3;System.out.println('c'),num++){
            System.out.println('b');
        }
        //输出结果：abcbcbc
        System.out.println();

        //例题：遍历100以内偶数，输出所有偶数的和，输出偶数的个数
        int sum = 0;//记录所有偶数的和
        int count = 0;//记录偶数的个数
        for(int i = 1 ;  i <= 100;i++){

            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
                count++;
            }
            //System.out.println("总和为：" + sum);
        }
        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);


    }
}

class ForTest1 {
    public static void main(String[] args) {
        for(int i = 1;i <= 150; i++){

            System.out.println(i +"");
            if(i % 3 == 0){
                System.out.println("foo ");
            if(i % 5 == 0){
                System.out.println("biz");
            if(i % 7 == 0){
                System.out.println("baz");

            }
            //换行
                System.out.println();
                }
            }
        }

    }
}
/*
* 题目：输入两个整数m和n，求其最大公约数和最小公倍数
* 比如：12和20的最大公约数是4，最小公倍数是60
*
* 说明break关键字的使用
* */

class Fortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正数：");
        int m = scan.nextInt();

        System.out.println("请输入第二个整数：");
        int n = scan.nextInt();


        //获取最大公约数
        //获取两个数中的较小值

        int min = (m <= n) ? m : n;
        //遍历
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为：" + i);
                break;//一旦在循环中执行到break,就跳出循环
            }
        }
        //获取最小公倍数
        //1.获取两个数中的较大值
        int max = (m >= n) ? m : n;
        //2.遍历
        for(int i = max;i <= m * n; i++){

            System.out.println("最小公倍数:" + i);
            break;
        }
    }
}


/*
while循环的使用
①初始化条件
②循环条件
③循环体
④迭代条件

二、while循环的结构

①
while(②){
  ③；
  ④；
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②

说明：
1.写while循环千万小心不要丢了迭代条件。一旦丢了，就可能导致死循环
2.我们写程序，要避免出现死循环
3.for循环和while循环是可以相互转换的！
区别：for循环和while循环的初始化条件部分的作用范围不同


算法：有限性
*/
class WhileTest{
    public  static void main(String[]args){

        //遍历100以内的所有偶数
        int i = 1;
        while (i <= 100){

            if(i % 2 ==0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println(i);//101
    }
}
/*
do-while循环的使用
一、循环结构的4个要素
①初始化条件
②循环条件 --->是Boolean类型
③循环体
④迭代条件

二、do-while循环结构：
①
do{
   ③；
   ④；
 }while(②)；
 执行过程：① - ③ - ④ - ② - ③ - ④ - ② - ③ -...- ②
说明
1.do-while循环至少会执行一次循环体！
2.开发中，使用for和while更多一些，较少使用do-while



*/
class DowhileTest {
    public static void main(String[] args) {

        //遍历100以内的偶数
        int num = 1;
        int sum = 0;//记录总和
        int count =0;//记录个数
        do {
            if (num % 2 == 0) {
                System.out.println(num);
                sum += num;
                count++;
            }

            num++;
        } while (num <= 100);
        System.out.println("总数为：" + sum);
        System.out.println("个数为" + count);

        //***********************
        int number1 = 15;
        while(number1 > 15){
            System.out.println("hello:while");
            number1--;
        }
        int number2 = 10;
        do{
            System.out.println("hello:while");
            number2--;
        }while(number2 > 10);
    }
}