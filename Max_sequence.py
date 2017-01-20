class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        max_len=-100
        stack=[]
        try:
            stack.append(s[1])
        except Exception:
            print s[1]
        for i in xrange(len(s)-1):
            if i<2:
                continue
            else:
                if s[i] in stack:
                    length=len(stack)
                    if length>max_len:
                        max_len=length
                    stack=[]
                    stack.append(s[0])
                else:
                    stack.append(s[i])
            
        return max_len
        
ans=Solution()
input_str=raw_input()
if len(input_str)>2:
    print ans.lengthOfLongestSubstring(input_str)
                    
        