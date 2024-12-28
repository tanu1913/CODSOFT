import java.util.*;
public class StudentGradeCalculator {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int hindi, eng, physics, chemistry, math;
    double total, averagepercentage;
    String grade;

    System.out.println("Enter marks of Hindi out of 100 :  ");
    hindi=s.nextInt();

    System.out.println("Enter marks of English out of 100 :  ");
    eng=s.nextInt();

    System.out.println("Enter marks of Maths out of 100 :  ");
    math=s.nextInt();

    System.out.println("Enter marks of Physics out of 100 :  ");
    physics=s.nextInt();

    System.out.println("Enter marks of Chemistry out of 100 :  ");
    chemistry=s.nextInt();

    total=hindi+eng+math+physics+chemistry;
    averagepercentage=((total/500)*100);

    
  if(averagepercentage>=90){
    grade="A+";
  }else if (averagepercentage>=80) {
    grade="A";
  }else if (averagepercentage>=70) {
    grade="B+";
  }else if (averagepercentage>=60) {
    grade="B";
  }else if (averagepercentage>=50) {
    grade="C+";
  }else if (averagepercentage>=40) {
    grade="C";
  }else  {
    grade="F";
  }

  System.out.println("Total marks  :   "+total);
  System.out.println("Percentage achieved  :  "+averagepercentage+ " %");
  System.out.println("Grade  :  "+grade);

  if(grade=="A+"){
    System.out.println("Congratulations you have passed the examination with A+ grade and "+averagepercentage+" %. Excellent Work .....");
  }else if(grade=="A"){
    System.out.println("Congratulations you have passed the examination with A grade and "+averagepercentage+" %. Very very good .....");
  }else if(grade=="B+"){
    System.out.println("Congratulations you have passed the examination with B+ grade and "+averagepercentage+" %.Good.....");
  }else if(grade=="B"){
    System.out.println("Congratulations you have passed the examination with B grade and "+averagepercentage+" %. You can achieve more .....");
  }else if(grade=="C+"){
    System.out.println("Congratulations you have passed the examination with C+ grade and "+averagepercentage+" %.Keep it up  .....");
  }else if(grade=="C"){
    System.out.println("Congratulations you have passed the examination with C grade and "+averagepercentage+" %. Work Hard .....");
  }else{
    System.out.println("You have failed in the examination..........");
  }
  }
      
}
