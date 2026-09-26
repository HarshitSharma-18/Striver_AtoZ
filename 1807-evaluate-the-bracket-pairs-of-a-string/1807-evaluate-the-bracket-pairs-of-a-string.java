class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = knowledge.size();
        int m = s.length();
        HashMap<String , String> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            map.put(knowledge.get(i).get(0) , knowledge.get(i).get(1));
        }

        StringBuilder result = new StringBuilder();


        for(int i = 0 ; i < m ; i++){
            if(s.charAt(i) == '('){
                StringBuilder temp = new StringBuilder();

                i++;
                while(s.charAt(i) != ')'){
                    temp.append(s.charAt(i));
                    i++;
                }

                if(map.containsKey(temp.toString())){
                    result.append(map.get(temp.toString()));
                }
                else{
                    result.append('?');
                }
            }
            else{
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}