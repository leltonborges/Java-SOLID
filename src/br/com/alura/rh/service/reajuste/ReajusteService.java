package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacaoReajustes;

    public ReajusteService(List<ValidacaoReajuste> validacaoReajustes) {
        this.validacaoReajustes = validacaoReajustes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
        validacaoReajustes.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
