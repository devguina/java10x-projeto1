package com.java10x.projeto1.entity;

public enum NinjaTitulo {

    NENHUM(0),
    SANNIN(1),
    NUKENNIN(2),
    KAGE(3);

    private final int codigo;

    NinjaTitulo(int codigo) {
        this.codigo = codigo;
    }

    // -- methods for use in NinjaMapper and DTO

    public int getCodigo() {
        return codigo;
    }

    public static NinjaTitulo fromCodigo(int codigo){
        for(NinjaTitulo ninjaTitulo : NinjaTitulo.values()){
            if (ninjaTitulo.getCodigo() == codigo){
                return ninjaTitulo;
            }
        }
        throw new IllegalArgumentException("Titulo ilegal: " + codigo);
    }

}
