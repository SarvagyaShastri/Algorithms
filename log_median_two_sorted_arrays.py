
#incomplete
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        print nums1
        print nums2
        if len(nums1)==1:
        	return float(nums1[0]+nums2[0])/2
        if len(nums1)%2!=0:
        	median=nums1[((len(nums1)+1)/2)-1]
        else:
        	median=float(nums1[(len(nums1)+1)/2]+nums1[(len(nums1)/2)-1])/2
        if len(nums2)%2!=0:
        	median_2=nums2[((len(nums2)+1)/2)-1]
        else:
        	median_2=float(nums2[(len(nums2)+1)/2]+nums2[(len(nums2)/2)-1])/2
        
        if median>median_2:
        	if type(median) == type(2):
        		return self.findMedianSortedArrays(nums1[:nums1.index(int(median))+1],nums2[nums2.index(int(median_2)):])
        	else:
        		return self.findMedianSortedArrays(nums1[:nums1.index(int(median))+1],nums2[nums2.index(int(median_2))+1:])
        elif median_2>median:
        	print int(median),int(median_2)
        	if type(median) == type(2):
        		return self.findMedianSortedArrays(nums1[nums1.index(int(median)):],nums2[:nums2.index(int(median_2))+1])
        	else:
        		return self.findMedianSortedArrays(nums1[nums1.index(int(median))+1:],nums2[:nums2.index(int(median_2))+1])
        else:
        	return median
        
        
ans=Solution()
arr1=map(int,raw_input().split())
arr1.sort()
arr2=map(int,raw_input().split())
arr2.sort()
print ans.findMedianSortedArrays(arr1,arr2)

        