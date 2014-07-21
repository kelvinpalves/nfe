package com.fincatto.nfe.classes.nota;

import java.math.BigDecimal;

import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;

import com.fincatto.nfe.classes.NFBase;

public class NFNotaInfoDuplicata extends NFBase {
    @Element(name = "nDup", required = false)
    private String numeroDuplicata;

    @Element(name = "dVenc", required = false)
    private LocalDate dataVencimento;

    @Element(name = "vDup", required = false)
    private BigDecimal valorDuplicata;

    public String getNumeroDuplicata() {
        return this.numeroDuplicata;
    }

    public void setNumeroDuplicata(final String numeroDuplicata) {
        this.numeroDuplicata = numeroDuplicata;
    }

    public LocalDate getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(final LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValorDuplicata() {
        return this.valorDuplicata;
    }

    public void setValorDuplicata(final BigDecimal valorDuplicata) {
        this.valorDuplicata = valorDuplicata;
    }
}