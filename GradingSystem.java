import java.text.DecimalFormat;
public class GradingSystem {
    private int id_nombre;
    private int id_genero;
    private int id_materia;
    private float id_calificacion;
    static int cont_calificacion_s=0;
    static int calificacion_a=0;
    static int cant_notas;
    static float prom_l=0;
    static float prom_b=0;
    static float prom_g=0;
    static int est_mejor_des_lite=0;
    static float mejor_cal_liter=0;
    public GradingSystem(){
    }
    public GradingSystem(Integer id_nombre, Integer id_genero, Integer id_materia, float id_calificacion){
        this.id_nombre = id_nombre;
        this.id_genero = id_genero;
        this.id_materia = id_materia;
        this.id_calificacion = id_calificacion;
    }
    public Integer getId_nombre(){
        return this.id_nombre;
    }
    public void setId_nombre(Integer id_nombre){
        this.id_nombre = id_nombre;
    }
    public Integer getId_genero(){
        return this.id_genero;
    }
    public void setId_genero(Integer id_genero){
        this.id_genero = id_genero;
    }
    public Integer getId_materia(){
        return this.id_materia;
    }
    public void setId_materia(Integer id_materia){
        this.id_materia = id_materia;
    }
    public float getId_calificacion(){
        return this.id_calificacion;
    }
    public void setId_calificacion(float id_calificacion){
        this.id_calificacion = id_calificacion;
    }
    GradingSystem notas[];
    String [] materias = {"literatura", "biologia", "geografia"};
    String [] estudiantes = {"armando", "nicolas", "daniel", "maria", "marcela", "alexandra"};
    
    public float stat1(){
        for (int i = 0; i < cant_notas; i++)
        {
            switch(notas[i].getId_materia())
                {
                    case 1: prom_l=prom_l + notas[i].getId_calificacion();
                        if(notas[i].getId_calificacion() > mejor_cal_liter)
                        {
                            mejor_cal_liter = notas[i].getId_calificacion();
                            est_mejor_des_lite = notas[i].getId_nombre();
                        }
                        break;
                    case 2: prom_b = prom_b + notas[i].getId_calificacion();
                        break;
                    case 3: prom_g = prom_g + notas[i].getId_calificacion();
                        break;    
                }
            
            if(notas[i].getId_calificacion() > 6 && notas[i].getId_calificacion() <= 8)
            {
                calificacion_a++;
            }
            else if(notas[i].getId_calificacion() > 8 && notas[i].getId_calificacion() <= 9)
            {
                calificacion_a++;
                cont_calificacion_s++;
            }
            else if(notas[i].getId_calificacion() > 9 && notas[i].getId_calificacion() <= 10)
            {
                calificacion_a++;
            }
        }
        float porc_aprob = (float)calificacion_a / cant_notas;
        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        String s_porc_aprob = dosDecimales.format(porc_aprob);
        s_porc_aprob = s_porc_aprob.replace(",",".");
        float nombrex = Float.parseFloat(s_porc_aprob);
        return nombrex;
    }
    public int stat2(){
        return cont_calificacion_s;
    }
    public String stat3(){
        int cant_est = cant_notas / 3;
        int pos=0;
        prom_l = prom_l / cant_est;
        prom_b = prom_b / cant_est;
        prom_g = prom_g / cant_est;
        if(prom_l < prom_b && prom_l < prom_g)
        {
            pos=0;
        }
        else if(prom_b < prom_l && prom_b < prom_g)
        {
            pos=1;
        }
        else if(prom_g < prom_l && prom_g < prom_b)
        {
            pos=2;
        }
        return materias[pos];
    }
    public String stat4(){
        return estudiantes[est_mejor_des_lite-1];
    }
}
