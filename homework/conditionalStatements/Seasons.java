public class Seasons {
    String season(String month) {
        switch (month.toLowerCase()) {
            case “january”:
            case “february”:
            case “march”:
                return “winter”;
                
            case “april”:
            case “may”:
            case “june”:
                return “spring”;
                
            case “july”:
            case “august”:
            case “september”:
                return “summer”;
                
            default:
                return "fall";
    }
}
    
