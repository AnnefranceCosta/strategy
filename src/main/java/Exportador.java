public class Exportador {
    private String dados;

    public Exportador(String dados) {
        this.dados = dados;
    }

    public String gerar(Exportacao estrategia) {
        return estrategia.exportar(this.dados);
    }
}
