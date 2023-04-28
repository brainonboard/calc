package es.brainonboard.calc.service.endpoints;

import java.math.BigDecimal;

//import io.corp.calculator.TracerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.brainonboard.calc.service.intf.ICalcService;
import io.corp.calculator.TracerImpl;

/**
 * manage the method GET /api/calculate
 */
@RestController
@Endpoint(id = "calculate")
@RequestMapping(path = "/api",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class CalcController {

    @Autowired
    private ICalcService calcService;

    private TracerImpl tracer = new TracerImpl();

    @GetMapping(value = "/calculate")
    public ResponseEntity<Double> calculate(@RequestParam(name = "first") BigDecimal firstOperand,
                                            @RequestParam(name = "second") BigDecimal secondOperand,
                                            @RequestParam(name = "operation") String operation) {

        double result = this.calcService.calculate(firstOperand, secondOperand, operation);
        tracer.trace(result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
