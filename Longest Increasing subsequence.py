#LIS IN O(NLOGN)

def findIndex(sequence,value):
	
	middle=0
	beg=0
	end=len(sequence)
	while end-beg>1:
		middle=beg+(end-beg)/2
		if sequence[middle]>value:
			end=middle
		else:
			beg=middle
	return end

	#

def find_lis(elements):
	sequence=[]
	sequence.append(elements[0])
	for i in xrange(1,len(elements)):
			if elements[i]>sequence[-1]:
				sequence.append(elements[i])
			elif elements[i]<sequence[0]:
				sequence[0]=elements[i]
			else:
				index=findIndex(sequence,elements[i])
				print index,"this is index","______________________________________________________"
				sequence[index]=elements[i]

	print len(sequence)



def main():
	try:
		elements=map(int, raw_input("Enter the elements").split())
	except Exception:
		print "Please enter integer values next time."
	lis=[1]*len(elements)

	find_lis(elements)


main()