package kalinceses;

public class KalinceSes {

    public static void main(String[] args) {
        
        char harf = 'E';
        
        switch(harf)
        {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Girilen harf kalin sesli harftir.");
                break;
            default:
                System.out.println("Girilen harf ince sesli harftir");
        }           
    }
    
}
