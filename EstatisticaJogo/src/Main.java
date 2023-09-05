public class Main {
    public static void main(String[] args) {

        Time time1 = new Time();
        Time time2 = new Time();
        Calcular calcular = new Calcular();



        time1.gol = 2;
        time1.chuteAoGol = 3;
        time1.totalCartaoAmarelo = 2;
        time1.totalCartaoVermelho = 1;
        time1.totalFalta = 2;
        time1.posseDefesa = 30;
        time1.posseAtaque= 30;

        time2.gol = 2;
        time2.chuteAoGol = 3;
        time2.totalCartaoAmarelo = 2;
        time2.totalCartaoVermelho = 1;
        time2.totalFalta = 2;
        time2.posseDefesa = 30;
        time2.posseAtaque= 30;

        calcular.TemposJogo(time1,time2);
        calcular.FaltasCartoes(time1,time2);
        calcular.ChutesGols(time1,time2);


    }
}

//3 2 1 2 30 30