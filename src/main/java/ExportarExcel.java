public class ExportarExcel implements Exportacao{
    public String exportar(String dados) {
        return "Arquivo Excel: [Planilha]" + dados + "[/Planilha]";
    }
}
