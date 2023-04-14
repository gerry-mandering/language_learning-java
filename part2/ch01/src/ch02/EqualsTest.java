package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student Lee = new Student(100, "Lee");
        Student Lee2 = Lee;
        Student Shun = new Student(100, "Lee");

        Student Lee3 = (Student) Lee.clone();

        System.out.println("Lee3.toString() = " + Lee3.toString());

//        System.out.println("Lee.hashCode() = " + Lee.hashCode());
//        System.out.println("Shun.hashCode() = " + Shun.hashCode());
//
//        System.out.println("System.identityHashCode(Lee) = " + System.identityHashCode(Lee));
//        System.out.println("System.identityHashCode(Shun) = " + System.identityHashCode(Shun));

//        System.out.println("Lee = " + Lee);
//        System.out.println("Lee2 = " + Lee2);
//        System.out.println("Lee == Lee2 = " + (Lee == Lee2));
//
//        System.out.println("(Lee == Shun) = " + (Lee == Shun));
//        System.out.println("Lee.equals(Shun) = " + Lee.equals(Shun));
//
//        String str1 = new String("test");
//        String str2 = new String("test");
//
//        System.out.println("(str1 == str2) = " + (str1 == str2));
//        System.out.println("str1.equals(str2) = " + str1.equals(str2));
    }
}
