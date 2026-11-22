import javaProject.src.Employee;

import java.io.PrintStream;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;

class Main  {
  static void main(String[] argsS) {
//      //Sample sample=new Sample();
//Isum isum1= Sample::doAddition;
//int isum2= isum1.Addition(new Sample(),3,4);
//      System.out.println(isum2);
////      Isum isum=Integer::sum;
////int isum3=isum.Addition(10,20);
////       System.out.println(isum3);
////Isum isum4= Main::sum;
////int isum5 =isum4.Addition(10,5);
////      System.out.println(isum5);
//      String str1="hello";
//      String str2="world";
//      String result=str1.concat(str2);
//      System.out.println(result);


//      BiFunction<String,String,String> string =String::concat;
//      String result1=string.apply("hello","koushik");
//      System.out.println(result1);
//      //String str="koushik";
//       Function<String,String> toupper  =String::toUpperCase;
//       String res=toupper.apply("koushik");
//      System.out.println(res );
//      BiConsumer<PrintStream,String> print =PrintStream::print;
//      print.accept(new PrintStream(System.out),"koushik");
//
//      Sample sample=new Sample();
//      BiFunction<Integer,Integer,Integer> bifun= sample::doAddition;
//      Integer result =bifun.apply(10,10);
//      System.out.println(result);
//      Function<Employee,String> empname=Employee::getName;
//      String name= empname.apply(new Employee(1,"laddu"));
//      System.out.println(name);
      List<String> stringList= List.of("koushik","karthik","hari","santosh","amit");
      stringList.stream()
              .map(Employee::new)
              .map(employee -> {
                  employee.setId(ThreadLocalRandom.current().nextInt(1,100));
                  return employee;
              })
             // .map(employee -> {return employee.getName();})
              .map(Employee::getName)
              .map(String::toUpperCase)
          .forEach(System.out::println);




    }
    static int sum(int value1,int value2)
    {
        return value1/value2;
    }
}