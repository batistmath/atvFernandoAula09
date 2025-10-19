package agecalculator.agecalculator;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Period;

@Service
public class AgeCalculatorService {

    public AgeResponse calculateAge(String firstName, String lastName, LocalDate dob) {
        
        LocalDate today = LocalDate.now();

        if (dob.isAfter(today)) {
            throw new IllegalArgumentException("A data de nascimento não pode ser no futuro.");
        }

        Period period = Period.between(dob, today);

        String fullName = firstName;
        if (lastName != null && !lastName.trim().isEmpty()) {
            fullName += " " + lastName;
        }

        return new AgeResponse(
            fullName,
            period.getYears(),
            period.getMonths(),
            period.getDays()
        );
    }
}