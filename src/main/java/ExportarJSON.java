public class ExportarJSON implements Exportacao{
    public String exportar(String dados) {
        return "Arquivo JSON: {\"data\": \"" + dados + "\"}";
    }
}
