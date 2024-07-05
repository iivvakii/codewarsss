package complementaryDNA;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        char[] charArr = dna.toCharArray();
        int i = 0;
        for(char c : charArr){
            switch(c){
                case 'A':
                    charArr[i] = 'T';
                    i++;
                    break;
                case 'T':
                    charArr[i] = 'A';
                    i++;
                    break;
                case 'G':
                    charArr[i] = 'C';
                    i++;
                    break;
                case 'C':
                    charArr[i] = 'G';
                    i++;
                    break;
            }
        }
        return new String(charArr);
    }
}
