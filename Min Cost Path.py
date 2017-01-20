def main():
	rows=int(raw_input("Enter number of rows\n"))
	cost=[map(int,raw_input("Enter row").split()) for i in range(rows)]
	calc=[[0 for i in range(len(cost[0]))] for j in range(rows)]
	calc[0][0]=cost[0][0]
	for i in range(1,rows):
		calc[i][0]=calc[i-1][0]+cost[i][0]
	
	for i in range(1,len(cost[0])):
		calc[0][i]=calc[0][i-1]+cost[0][i]

	for i in range(1,rows):
		for j in range(1,len(cost[0])):
			calc[i][j]=min(calc[i-1][j],calc[i][j-1],calc[i-1][j-1])+cost[i][j]

	print "Enter cell to find min cost path. Do not enter index, enter row and column"
	print calc[int(raw_input())-1][int(raw_input())-1]," is the min cost path"


	

main()