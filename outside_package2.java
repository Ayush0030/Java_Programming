package outside_package_folder2;
import outside_package_folder1.outside_package1;
public class outside_package2 {
    int age=10;
    public static void main(String Args[]) {
    outside_package1 obj = new outside_package1();
    System.out.println(obj.a);
    obj.trial();

    }
}
