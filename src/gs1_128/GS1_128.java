package gs1_128;

import java.util.HashMap;

public class GS1_128 
{
    static final int ERROR_CODE_UNKNOWN_AI = 1;
    static final int ERROR_CODE_INCOMPLETE_AI = 2;
    static final int ERROR_CODE_NOT_FOUND_SEPARATOR = 3;
    static final int ERROR_CODE_INSUFFICIENT_VALUE_LENGTH = 4;
    static final int ERROR_CODE_EXCEEDED_VALUE_LENGTH = 5;
    static final int ERROR_CODE_CONVERT_DECIMAL_POINT = 5;
    static final int ERROR_CODE_WRONG_DECIMAL_POINT = 6;
    static final int ERROR_CODE_CONVERT_DECIMAL_VALUE = 7;
    
    static final int GS1_128_AI_SEPARATOR = '\u001D';
    
    static class GS1_128_AI_INFO
    {
        public final int minLength;
        public final int length;
        public final boolean variableLength;
        public final boolean decimalPoint;
        
        public GS1_128_AI_INFO(int minLength, int length, boolean variableLength, boolean decimalPoint)
        {
            this.minLength = minLength;
            this.length = length;
            this.variableLength = variableLength;
            this.decimalPoint = decimalPoint;
        }                
    }
            
    static final HashMap<String, GS1_128_AI_INFO> GS1_128_AI = new HashMap<>();
    static
    {
        GS1_128_AI.put("00", new GS1_128_AI_INFO(0, 18, false, false));
        GS1_128_AI.put("01", new GS1_128_AI_INFO(0, 14, false, false));
        GS1_128_AI.put("02", new GS1_128_AI_INFO(0, 14, false, false));
        GS1_128_AI.put("10", new GS1_128_AI_INFO(0, 20, true, false));
        GS1_128_AI.put("11", new GS1_128_AI_INFO(0, 6, false, false));
        GS1_128_AI.put("12", new GS1_128_AI_INFO(0, 6, false, false));
        GS1_128_AI.put("13", new GS1_128_AI_INFO(0, 6, false, false));
        GS1_128_AI.put("14", new GS1_128_AI_INFO(0, 6, false, false));
        GS1_128_AI.put("15", new GS1_128_AI_INFO(0, 6, false, false));
        GS1_128_AI.put("17", new GS1_128_AI_INFO(0, 6, false, false));
        GS1_128_AI.put("20", new GS1_128_AI_INFO(0, 2, false, false));
        GS1_128_AI.put("21", new GS1_128_AI_INFO(0, 20, true, false));
        GS1_128_AI.put("240", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("241", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("242", new GS1_128_AI_INFO(0, 6, true, false));
        GS1_128_AI.put("250", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("251", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("253", new GS1_128_AI_INFO(13, 30, true, false));
        GS1_128_AI.put("254", new GS1_128_AI_INFO(0, 20, true, false));
        GS1_128_AI.put("255", new GS1_128_AI_INFO(13, 25, true, false));
        GS1_128_AI.put("30", new GS1_128_AI_INFO(0, 8, true, false));
        GS1_128_AI.put("310", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("311", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("312", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("313", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("314", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("315", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("316", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("320", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("321", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("322", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("323", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("324", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("325", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("326", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("327", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("328", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("329", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("330", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("331", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("332", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("333", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("334", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("335", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("336", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("340", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("341", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("342", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("343", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("344", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("345", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("346", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("347", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("348", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("349", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("350", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("351", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("352", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("353", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("354", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("355", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("356", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("357", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("360", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("361", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("362", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("363", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("364", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("365", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("366", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("367", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("368", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("369", new GS1_128_AI_INFO(0, 6, false, true));
        GS1_128_AI.put("37", new GS1_128_AI_INFO(0, 8, true, false));
        GS1_128_AI.put("390", new GS1_128_AI_INFO(0, 15, true, true));
        GS1_128_AI.put("391", new GS1_128_AI_INFO(3, 18, true, true));
        GS1_128_AI.put("392", new GS1_128_AI_INFO(0, 15, true, true));
        GS1_128_AI.put("393", new GS1_128_AI_INFO(3, 18, true, true));
        GS1_128_AI.put("400", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("401", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("402", new GS1_128_AI_INFO(0, 17, false, false));
        GS1_128_AI.put("403", new GS1_128_AI_INFO(3, 30, true, false));
        GS1_128_AI.put("410", new GS1_128_AI_INFO(0, 17, false, false));
        GS1_128_AI.put("411", new GS1_128_AI_INFO(0, 17, false, false));
        GS1_128_AI.put("412", new GS1_128_AI_INFO(0, 17, false, false));
        GS1_128_AI.put("413", new GS1_128_AI_INFO(0, 17, false, false));
        GS1_128_AI.put("414", new GS1_128_AI_INFO(0, 17, false, false));
        GS1_128_AI.put("420", new GS1_128_AI_INFO(0, 20, true, false));
        GS1_128_AI.put("421", new GS1_128_AI_INFO(0, 0, true, false));
        GS1_128_AI.put("422", new GS1_128_AI_INFO(0, 3, false, false));
        GS1_128_AI.put("423", new GS1_128_AI_INFO(3, 15, true, false));
        GS1_128_AI.put("424", new GS1_128_AI_INFO(0, 3, false, false));
        GS1_128_AI.put("425", new GS1_128_AI_INFO(0, 3, false, false));
        GS1_128_AI.put("426", new GS1_128_AI_INFO(0, 3, false, false));
        GS1_128_AI.put("7001", new GS1_128_AI_INFO(0, 13, false, false));
        GS1_128_AI.put("7002", new GS1_128_AI_INFO(0, 30, false, false));
        GS1_128_AI.put("7003", new GS1_128_AI_INFO(0, 10, false, false));
        GS1_128_AI.put("7004", new GS1_128_AI_INFO(0, 4, true, false));
        GS1_128_AI.put("8001", new GS1_128_AI_INFO(0, 14, false, false));
        GS1_128_AI.put("8002", new GS1_128_AI_INFO(0, 20, true, false));
        GS1_128_AI.put("8003", new GS1_128_AI_INFO(14, 30, true, false));
        GS1_128_AI.put("8004", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("8005", new GS1_128_AI_INFO(0, 6, false, false));
        GS1_128_AI.put("8006", new GS1_128_AI_INFO(0, 18, false, false));
        GS1_128_AI.put("8007", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("8008", new GS1_128_AI_INFO(8, 12, true, false));
        GS1_128_AI.put("8018", new GS1_128_AI_INFO(0, 18, false, false));
        GS1_128_AI.put("8020", new GS1_128_AI_INFO(0, 25, true, false));
        GS1_128_AI.put("8100", new GS1_128_AI_INFO(0, 6, false, false));
        GS1_128_AI.put("8101", new GS1_128_AI_INFO(0, 10, false, false));
        GS1_128_AI.put("8102", new GS1_128_AI_INFO(0, 2, false, false));
        GS1_128_AI.put("8110", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("8200", new GS1_128_AI_INFO(0, 70, true, false));
        GS1_128_AI.put("90", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("91", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("92", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("93", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("94", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("95", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("96", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("97", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("98", new GS1_128_AI_INFO(0, 30, true, false));
        GS1_128_AI.put("99", new GS1_128_AI_INFO(0, 30, true, false));
    }
    
    static class GS1_128_PARSE_EXCEPTION extends Exception
    {
        final String ai;
        final int errorCode;
        final String errorMessage;
     
        public GS1_128_PARSE_EXCEPTION(final String ai, final int errorCode, final String errorMessage)
        {
            this.ai = ai;
            this.errorCode = errorCode;
            this.errorMessage = errorMessage;
        }

        @Override
        public String toString() 
        {
            return "AI: " + ai + ", errorCode: " + errorCode + ", errorMessage: " + errorMessage;
        }                
    }
    
    public static void GS1_128_PARSE(String barcode, HashMap<String, String> attr) throws GS1_128_PARSE_EXCEPTION
    {        
        StringBuilder ai = new StringBuilder();
        int ai_len, decimal_point = 0;
        
        for(int i = 0, l = barcode.length(); i < l; ++i)
        {
            ai_len = ai.length();
            if(ai_len > 1)
            {
                GS1_128_AI_INFO aii = GS1_128_AI.get(ai.toString());
                if(aii == null)
                {
                    if(ai_len < 4)
                       ai.append(barcode.charAt(i));
                    else
                       throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_UNKNOWN_AI, "Unknown AI");
                }
                else
                {                    
                    if(aii.decimalPoint)
                    {
                        try
                        {
                            decimal_point = Integer.valueOf(String.valueOf(barcode.charAt(i)));
                        }
                        catch(NumberFormatException e)
                        {
                            throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_CONVERT_DECIMAL_POINT, "Errow convert to decimal point");
                        }     
                                                
                        if(++i >= l)
                           throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_INSUFFICIENT_VALUE_LENGTH, "Insufficient value length");
                    }
                    
                    String value;
                    
                    if(aii.variableLength)
                    {
                        int index_separator = barcode.indexOf(GS1_128_AI_SEPARATOR, i);
                        
                        if(index_separator < 0)
                        {
                            if(l - i > aii.length)
                               throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_NOT_FOUND_SEPARATOR, "Not found separator");
                            else if(l - i  < aii.minLength)
                               throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_INSUFFICIENT_VALUE_LENGTH, "Insufficient value length");
                            else
                            {
                                value = barcode.substring(i);
                                i = l;
                            }
                        }
                        else if(index_separator - i > aii.length)
                            throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_EXCEEDED_VALUE_LENGTH, "Exceeded value length");
                        else if(index_separator - i < aii.minLength)
                            throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_INSUFFICIENT_VALUE_LENGTH, "Insufficient value length");
                        else
                        {
                           value = barcode.substring(i, index_separator);                         
                           i = index_separator;
                        }
                    }
                    else
                    {
                        if(i + aii.length > l)
                            throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_INSUFFICIENT_VALUE_LENGTH, "Insufficient value length");
                                                
                        value = barcode.substring(i, i + aii.length);
                        i += aii.length - 1;
                    }
                    
                    if(aii.decimalPoint && decimal_point > 0)
                    {
                        if(decimal_point >= value.length())
                           throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_WRONG_DECIMAL_POINT, "Decimal point more then value length");
                            
                        try
                        {
                           value = String.valueOf(Double.valueOf(value.substring(0, value.length() - decimal_point) + "." + value.substring(value.length() - decimal_point)));
                        }
                        catch(NumberFormatException e)
                        {
                           throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_CONVERT_DECIMAL_VALUE, "Error convert decimal point value");
                        }        
                    }
                    
                    attr.put(ai.toString(), value);
                    
                    ai.setLength(0);                    
                }
            }
            else
               ai.append(barcode.charAt(i));
        }
        
        if(ai.length() > 0)
           throw new GS1_128_PARSE_EXCEPTION(ai.toString(), ERROR_CODE_INCOMPLETE_AI, "Incomplete AI");                
    }        
}
