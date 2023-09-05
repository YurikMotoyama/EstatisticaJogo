import javax.sound.midi.spi.SoundbankReader;

public class Calcular implements Estatistica{


    @Override
    public void TemposJogo(Time time1, Time time2) {

        System.out.println("A bola rolou por " + time1.posseAtaque + time1.posseDefesa+ time2.posseAtaque + time2.posseDefesa);
        System.out.println("time 1 - tempo de posse no ataque: " +time1.posseAtaque);
        System.out.println("time 2 - tempo de posse no ataque: " +time2.posseAtaque);
        System.out.println("time 1 - tempo de posse na defesa: " +time1.posseDefesa);
        System.out.println("time 2 - tempo de posse no ataque: " +time2.posseDefesa);
    }
    @Override
    public void FaltasCartoes(Time time1, Time time2) {
        System.out.println("time 1 - total de faltas: "+time1.totalFalta);
        System.out.println("time 2 - total de faltas: "+time2.totalFalta);
        System.out.println("time 1 - total de cartões amarelos: "+time1.totalCartaoAmarelo);
        System.out.println("time 2 - total de cartões amarelos: "+time2.totalCartaoAmarelo);
        System.out.println("time 1 - total de cartões vermelhos: "+time1.totalCartaoVermelho);
        System.out.println("time 2 - total de cartões amarelos: "+time2.totalCartaoVermelho);
    }
    @Override
    public void ChutesGols(Time time1, Time time2) {
        System.out.println("Total de gols do jogo: " + time1.gol+time2.gol);
        System.out.println("time 1 - gols: "+time1.gol);
        System.out.println("time 2 - gols: "+time2.gol);
        System.out.println("time 1 - chutes ao gol: "+time1.chuteAoGol);
        System.out.println("time 1 - chutes ao gol: "+ time2.chuteAoGol);
    }
}
