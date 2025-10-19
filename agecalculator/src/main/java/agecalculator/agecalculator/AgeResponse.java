package agecalculator.agecalculator;


public record AgeResponse(
    String fullName,
    int years,
    int months,
    int days
) {
}