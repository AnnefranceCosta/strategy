public class SistemaRelatorios {
    private String resultadoUltimaExportacao;

    public String getResultado() {
        return resultadoUltimaExportacao;
    }

    public void salvarEmPDF(String conteudo) {
        Exportador exportador = new Exportador(conteudo);
        this.resultadoUltimaExportacao = exportador.gerar(new ExportarPDF());
    }

    public void salvarEmExcel(String conteudo) {
        Exportador exportador = new Exportador(conteudo);
        this.resultadoUltimaExportacao = exportador.gerar(new ExportarExcel());
    }

    public void salvarEmJSON(String conteudo) {
        Exportador exportador = new Exportador(conteudo);
        this.resultadoUltimaExportacao = exportador.gerar(new ExportarJSON());
    }
}
