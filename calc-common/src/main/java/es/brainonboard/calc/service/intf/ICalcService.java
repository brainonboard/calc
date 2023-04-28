package es.brainonboard.calc.service.intf;

import java.math.BigDecimal;

public interface ICalcService {

    /**
     * Method to perform the calculations given two numbers and an operation
     * @param first
     * @param second
     * @param operation
     * @return the result of the desired calculation
     *         
     */
    double calculate(BigDecimal first, BigDecimal second, String operation);
}