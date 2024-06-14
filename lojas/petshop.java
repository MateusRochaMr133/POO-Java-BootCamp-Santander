package lojas;

import animais.animal;
import animais.cachorros;

public class petshop {

    public void darBanho(animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(cachorros cachorros) {
        cachorros.setEstadoDeEspirito("tosado");
    }

    public void deixarNoHotel(animal animal) {
        animal.setEstadoDeEspirito("com saudades");
    }


}
