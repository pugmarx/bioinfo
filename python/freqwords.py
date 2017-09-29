import sys
import operator

inputLine = sys.stdin.readline()
kmerLen = int(sys.stdin.readline())

length = len(inputLine)
if(length < kmerLen):
	print "string is too small"
#print list(inputLine)
d=dict()
for i in range(len(inputLine)-(kmerLen)):
	s = inputLine[i:i+kmerLen]
	#print s
	v = int(d.get(s,0))
	d[s]=v+1

vals = d.values()
maxV = max(vals)
finalS = "";
for x in d:
	if(d.get(x)==maxV):
		finalS = x + " "

print finalS
