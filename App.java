import java.text.Format;

public class App{
    public static void main(String[] args) throws Exception{
        SchoolGradingSystem grade = new SchoolGradingSystem();
        grade.loadData();
        System.out.printf("%.2f\n",grade.stat1());
        System.out.println(grade.stat2());
        System.out.println(grade.stat3());
        System.out.println(grade.stat4());
    }
}
