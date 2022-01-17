package P11;

public class Principal {

    public static void main(String[] args) {

        Vehiculo carro = new Vehiculo(30);
        carro.setVelocidad(80);
        carro.acelerar(100);
        System.out.println(carro);

        Tren chuchu = new Tren(20,200);
        chuchu.ficharTicket(50);
        chuchu.destino();
        System.out.println(chuchu);

        Barco titanic = new Barco(20,7);
        titanic.acelerar(40);
        titanic.inicioViaje(5);
        titanic.diaTranscurrido();
        System.out.println(titanic);

        Automovil batmovil = new Automovil(60,4, 50);
        System.out.println(batmovil);
        batmovil.repostar(40);
        batmovil.acelerar(40);
        System.out.println(batmovil);

        Moto caballito = new Moto(30,2,15,250);
        System.out.println(caballito);
        caballito.caballito();

        Camion volcado = new Camion(20, 8, 200, 3000 );
        System.out.println(volcado);
        volcado.cargarCamion(20000);
        volcado.acelerar(50);
        volcado.repostar(300);
        System.out.println(volcado);

        Coche bmw = new Coche(0, 4, 50, 5);
        bmw.acelerar(120);
        System.out.println(bmw);

        Todoterreno cañonero = new Todoterreno(0,4,60,7,true);
        cañonero.acelerar(20);
        cañonero.repostar(10);
        System.out.println(cañonero);

        Turismo clio = new Turismo(0,4,30,3, 70);
        clio.trucar(20);
        clio.repostar(10);
        clio.acelerar(50);
        System.out.println(clio);

        Familiar picaso = new Familiar(0,4,60,5,6);
        picaso.recogerNiños();
        System.out.println(picaso);
    }

}
