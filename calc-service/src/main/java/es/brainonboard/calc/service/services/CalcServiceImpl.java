package es.brainonboard.calc.service.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import es.brainonboard.calc.enums.EOperation;
import es.brainonboard.calc.service.intf.ICalcService;

import java.math.BigDecimal;

/**
 * Basic Service implementation {@link ICalcService}
 */
@Service
public class CalcServiceImpl implements ICalcService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalcServiceImpl.class);

    private static final String C_CALCULATING_OPERATION ="calcserviceimpl.calculating.operation";
    
    private static final String C_UNSUPPORTED_OPERATION ="calcserviceimpl.unsupported.operation";
    /**
     * Performs the desired operation using the two numbers passed as parameters 
     * @param first
     * @param second
     * @param operation
     * @return
     */
    @Override
    public double calculate(BigDecimal first, BigDecimal second, String operation) {

    	LOGGER.debug( "{} : {} {} {}", C_CALCULATING_OPERATION,first, second, operation);

        EOperation operacion = EOperation.valueOf(operation); 

        if(operacion == null) {
            throw new RuntimeException(String.format("{}: {}",C_UNSUPPORTED_OPERATION, operation));
        }

        switch (operacion) {
            case A:
                return first.add(second).doubleValue();
            case S:
                return first.subtract(second).doubleValue();
            default:
                if(LOGGER.isErrorEnabled()) {
                    LOGGER.error("{}: {}", C_UNSUPPORTED_OPERATION, operacion);
                }
                throw new RuntimeException(String.format("{}: {}",C_UNSUPPORTED_OPERATION, operacion.toString()));
        }
    }
}