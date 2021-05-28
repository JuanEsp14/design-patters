package org.formacion;

public class BancoNostrumWrapper implements InternationalMoneyOrganization {

    BancoNostrum bancoNostrum = new BancoNostrumIml();

    @Override
    public void transfer(int cantidad, String cliente) {
        this.bancoNostrum.movimiento(cliente, cantidad);
    }

    @Override
    public int state(String cliente) {
        return this.bancoNostrum.estado(cliente) != null ? this.bancoNostrum.estado(cliente) : 0;
    }
}
