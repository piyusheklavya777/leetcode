class Solution {
    public String intToRoman(int n) {
        
        StringBuilder sb = new StringBuilder();
        
        int nForCount = n, place = 0;
        
        String[] tens = new String[]{"", "I", "X", "C", "M", " ERROR !!! "};
        String[] fives = new String[]{"", "V", "L", "D", " ERROR !!!"};
        
        while (nForCount > 0) {
            place += 1;
            nForCount /= 10;
        }
        
        while (place > 0) {
            
            int x = n / (int)Math.pow(10, place - 1);
            
            x %= 10;
            
            // System.out.println("new num: "+x+", place: "+place);
            
            String one = tens[place], ten = tens[place + 1], five = fives[place];
            
            switch (x) {
                case (1):
                    sb.append(one);
                    break;
                case (2):
                    sb.append(one);
                    sb.append(one);
                    break;
                case (3):
                    sb.append(one);
                    sb.append(one);
                    sb.append(one);
                    break;
                case (4):
                    sb.append(one);
                    sb.append(five);
                    break;
                case (5):
                    sb.append(five);
                    break;
                case (6):
                    sb.append(five);
                    sb.append(one);
                    break;
                case (7):
                    sb.append(five);
                    sb.append(one);
                    sb.append(one);
                    break;
                case (8):
                    sb.append(five);
                    sb.append(one);
                    sb.append(one);
                    sb.append(one);
                    break;
                case (9):
                    sb.append(one);
                    sb.append(ten);
                    break;
            }
            
            if (n / (int) Math.pow(10, Math.max(0, place - 2)) == 0) place--;
            place--;
            
        }
        
        return sb.toString();
        
    }
}