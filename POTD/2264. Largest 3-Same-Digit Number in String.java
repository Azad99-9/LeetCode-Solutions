class Solution {
    public String largestGoodInteger(String num) {
        if (num.indexOf("999") != -1) {
            return "999";
        } else if (num.indexOf("888") != -1) {
            return "888";
        } else if (num.indexOf("777") != -1) {
            return "777";
        } else if (num.indexOf("666") != -1) {
            return "666";
        } else if (num.indexOf("555") != -1) {
            return "555";
        } else if (num.indexOf("444") != -1) {
            return "444";
        } else if (num.indexOf("333") != -1) {
            return "333";
        } else if (num.indexOf("222") != -1) {
            return "222";
        } else if (num.indexOf("111") != -1) {
            return "111";
        } else if (num.indexOf("000") != -1) {
            return "000";
        }

        return "";
        
    }
}
