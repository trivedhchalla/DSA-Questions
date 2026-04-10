class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String name : strs){
            encodedString.append(name.length()+"*"+name);
        }
        System.out.println(encodedString.toString());
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int pointer = 0;

        while (pointer < str.length()) {
            int len = 0;
            while (str.charAt(pointer) != '*') {
                len = len * 10 + (str.charAt(pointer) - '0');
                pointer++;
            }
            pointer++;
            String word = str.substring(pointer, pointer + len);
            res.add(word);
            pointer += len;
        }
        return res;
    }
}

