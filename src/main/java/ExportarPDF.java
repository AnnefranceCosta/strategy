public class ExportarPDF implements Exportacao{
    public String exportar(String dados) {
        return "Arquivo PDF: <PDF>" + dados + "</PDF>";
    }
}
