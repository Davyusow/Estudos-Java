package Aula03.pratica;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class pratica01 {
    public static void main(String[] args) {
        Instant agora = Instant.now(); //momento exato atual
        Instant depois = agora.plus(2, ChronoUnit.HOURS);   //uma variável com 2 horas a mais, chronounit.hours define a unidade de médida usada
        Duration duracao = Duration.between(agora,depois);  //calcula a diferença entre dois horários
        System.out.println("Duração entre agora e depois: "+duracao.toHours());

        //Period (diferença entre datas)
        LocalDate hoje = LocalDate.now(); //Lê a data atual
        LocalDate futuro = hoje.plusMonths(6).plusDays(16);
        Period periodo = Period.between(hoje,futuro);
        System.out.println("Período Meses:"+periodo.getMonths()+" dias:"+periodo.getDays());
        System.out.println("Data atual: "+hoje);

        //LocalDateTime calcula data e hora juntos sem fuso horário
        LocalDateTime imediato = LocalDateTime.now();
        System.out.println("Data e horas atuais: "+imediato);

        //ZoneDateTime calcula data e hora juntos, com fuso horário
        ZonedDateTime verao = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data e hora com fuso horário: "+verao);

        LocalDateTime novaData = imediato.plusMinutes(30).plusHours(5).plusDays(2).plusYears(1);    //incrementa diferentes métricas na data
        System.out.println("Nova data: "+novaData);

        //Formatando datas
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //cria uma variável que formata a data no padrão configurado
        String formatada = imediato.format(formatador);
        System.out.println("Imediato formatado: "+formatada);


    }
}
