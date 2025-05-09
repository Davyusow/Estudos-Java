package classesutilitarias.datas;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date datas = new Date(1_000_000_000_000L);    //totalmente depreciada, mas presente em sistemas legado
        //long de ms
        System.out.println(datas);
        datas.setTime(datas.getTime());
        System.out.println(datas);
    }
}
