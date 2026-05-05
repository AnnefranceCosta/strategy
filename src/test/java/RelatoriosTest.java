import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelatoriosTest {
    @Test
    void deveExportarRelatorioParaExcel() {
        SistemaRelatorios sistema = new SistemaRelatorios();
        sistema.salvarEmExcel("Vendas Maio");
        assertEquals("Arquivo Excel: [Planilha]Vendas Maio[/Planilha]", sistema.getResultado());
    }

    @Test
    void deveExportarRelatorioParaPDF() {
        SistemaRelatorios sistema = new SistemaRelatorios();
        sistema.salvarEmPDF("Vendas Maio");
        assertEquals("Arquivo PDF: <PDF>Vendas Maio</PDF>", sistema.getResultado());
    }

    @Test
    void deveExportarRelatorioParaJSON() {
        SistemaRelatorios sistema = new SistemaRelatorios();
        sistema.salvarEmJSON("Vendas Maio");
        assertEquals("Arquivo JSON: {\"data\": \"Vendas Maio\"}", sistema.getResultado());
    }
}
