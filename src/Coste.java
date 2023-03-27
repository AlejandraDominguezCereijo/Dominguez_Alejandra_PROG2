public enum Coste {
    PATATAS_NORMALES(1.0),// cree la clase enumeradores para asignarle un precio  a cada plato y mas tarde poder implementarlos para que asi hiciera el calculo de el total del menu pero no pude llevarlo a cabo
    PATATAS_GAJO(1.2),
    NACHOS(3.5),
    TABLA_QUESOS(4),
    ENSALADA_TOMATE(3.75),
    ENSALADA_CESAR(7),
    GAMBAS(9),
    BROCHETA_POLLO(7.50),
    BACALAO_HORNO(14),
    CHUELETON_VACA(12),
    LASAÑA_ESPINACAS(12.5),
    PAELLA(14),
    TARTA_ZANAHORIA(7),
    COULANT_CHOCOLATE(6.5),
    HELADO(5),
    SORBETE_LIMON(6);
    private double precio;

    Coste() {
    }

    Coste(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
