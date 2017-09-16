import java.util.Scanner;
class uri1061{
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int diaInicio, diaFim, horaInicio, horaFim, minInicio, minFim, segInicio, segFim, cDias = 0, cHoras = 0, cMins = 0, cSegs = 0;
        boolean boolH = false, boolM = false, boolS = false;
        str = scan.next();
        diaInicio = scan.nextInt();
        horaInicio = scan.nextInt();
        str = scan.next();
        minInicio = scan.nextInt();
        str = scan.next();
        segInicio = scan.nextInt();
        str = scan.next();
        diaFim = scan.nextInt();
        horaFim = scan.nextInt();
        str = scan.next();
        minFim = scan.nextInt();
        str = scan.next();
        segFim = scan.nextInt();
        if(horaInicio > horaFim)
            boolH = true;
        if(minInicio > minFim)
            boolM = true;
        if(segInicio > segFim)
            boolS = true;
        while(diaInicio != diaFim){
            cDias++;
            diaInicio++;
        }
        while(horaInicio != horaFim){
            cHoras++;
            horaInicio++;
            if(horaInicio==25)
                horaInicio=1;
        }
        while(minInicio != minFim){
            cMins++;
            minInicio++;
            if(minInicio==61)
                minInicio = 1;
        }
        while(segInicio != segFim){
            cSegs++;
            segInicio++;
            if(segInicio==61)
                segInicio = 1;
        }
        if(boolH == true)
            cDias--;
        if(boolM == true)
            cHoras--;
        if(boolS == true)
            cMins--;
        System.out.println(cDias + " dia(s)");
        System.out.println(cHoras + " hora(s)");
        System.out.println(cMins + " minuto(s)");
        System.out.println(cSegs + " segundo(s)");
    }
}