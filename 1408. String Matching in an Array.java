import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        for (String ele1 : words) {
            for (String ele2 : words) {
                if (!ele1.equals(ele2) && ele2.contains(ele1)) {
                    result.add(ele1);
                    break;
                }
            }
        }
        
        return result;
    }
}
