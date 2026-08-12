class Solution {
    public String removeDuplicates(String s) {
        //Create a stack to use
        Deque<Character> stack = new ArrayDeque<>();
        //iterate through all char to find if it exists  or not , if it does then 
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        //pop else push
        //reutrn to string using Stringbuilder
          StringBuilder sb = new  StringBuilder();
          while(!stack.isEmpty()){
            sb.append(stack.pop());
          }
           return sb.reverse().toString();
    }
}
