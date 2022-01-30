package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.exception.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajuste implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {

        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate currencyDate = LocalDate.now();
        long mesesDesdeUltimoResjuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, currencyDate);

        if (mesesDesdeUltimoResjuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser no minimo de 6 meses!");
        }

    }
}
