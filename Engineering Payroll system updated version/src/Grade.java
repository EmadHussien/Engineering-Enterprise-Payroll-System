public class Grade {
    public Position Position;
    public double TaxRate;
    public double PayRate;


    public Grade(Position position) {
        Position = position;
        // Assign tax rate and pay rate based on the position
        AssignRates();
    }
    private void AssignRates()
    {
        // Assign tax rate and pay rate based on the position
        switch (Position)
        {
            case Manager:
                TaxRate = 0.2; // Example tax rate for Manager
                PayRate = 1000; // Example pay rate for Manager
                break;
            case TeamLeader:
                TaxRate = 0.15; // Example tax rate for Team Leader
                PayRate = 800; // Example pay rate for Team Leader
                break;
            case TeamMember:
                TaxRate = 0.1; // Example tax rate for Team Member
                PayRate = 600; // Example pay rate for Team Member
                break;
            // Add more cases for additional positions
            default:
                throw new IllegalArgumentException("Invalid position");
        }
    }

}
