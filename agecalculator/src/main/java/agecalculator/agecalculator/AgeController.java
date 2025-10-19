package agecalculator.agecalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/age")
public class AgeController {

    @Autowired
    private AgeCalculatorService ageCalculatorService;

    @GetMapping("/calculate")
    public ResponseEntity<AgeResponse> getAge(
            @RequestParam String firstName,
            @RequestParam(required = false) String lastName,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dob
    ) {
        
        AgeResponse response = ageCalculatorService.calculateAge(firstName, lastName, dob);
        return ResponseEntity.ok(response);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}