#Given two strings, find the longest commmon sequence in those strings.


def find_lcs(str1,str2):
	len1=len(str1)
	len2=len(str2)
	lcs=[[None for i in range(len2+1)] for j in range(len1+1)]
	for i in range(len1+1):
		for j in range(len2+1):
			if i==0 or j==0:
				try:
					lcs[i][j]=0
				except Exception:
					print i,j
			elif str1[i-1]==str2[j-1]:
				lcs[i][j]=1+lcs[i-1][j-1]
			else:
				lcs[i][j]=max(lcs[i][j-1],lcs[i-1][j])
		print lcs

	return lcs[len1][len2]




def main():
	input_=raw_input("Enter strings separated by space").split()
	str1=input_[0]
	str2=input_[1]
	longest_length=find_lcs(str1,str2)
	print longest_length



main()