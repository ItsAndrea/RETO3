import java.util.Scanner;

public class SchoolGradingSystem extends GradingSystem{
    public void loadData()
    {
        Scanner sc = new Scanner(System.in);
        String c_notas = sc.nextLine();
        cant_notas = Integer.parseInt(c_notas);
        String datos_est;
        int nombre, materia, genero;
        float calificacion; 
    
        notas = new GradingSystem[cant_notas];
        for(int i = 0; i < cant_notas; i++)
        {
            datos_est = sc.nextLine();
            String [] vect = datos_est.split(" ");
            nombre = Integer.parseInt(vect[0].substring(0,1));
            genero = Integer.parseInt(vect[1].substring(0,1));
            materia = Integer.parseInt(vect[2].substring(0,1));
            calificacion = Float.parseFloat(vect[3].substring(0,3));
            notas[i] = new GradingSystem(nombre, genero, materia, calificacion);
        }
        sc.close();
    }
}
