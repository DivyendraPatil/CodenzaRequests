def main():
	MAX=2000000
	nonprimes = MAX * [False]
	nonprimes[0] = nonprimes[1] = True
	sum = 0
	
	for i in range(2, MAX ): 
		if not nonprimes[i]:
			print(i, end=", ")
			sum = sum + i
			for j in range(2*i, MAX , i):
				nonprimes[j] = True
	print() 
	print(sum)

main()