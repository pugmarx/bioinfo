import sys
import operator

inputLine = sys.stdin.readline()
#kmerLen = int(sys.stdin.readline())
#g=sys.stdin.readline()
vs=sys.stdin.readline()
inputLine=inputLine.rstrip()
vlist=vs.split();
klen=int(vlist[0])
winlen=int(vlist[1])
occurs=int(vlist[2])

#print 'occurs'+str(occurs)

length = len(inputLine)
if(length < klen):
	print "string is too small"
#print list(inputLine)
c=int(0)
d=dict()
while(c<length):
	sector = inputLine[c:c+winlen]
	for i in range(len(sector)-(klen)):
		s = sector[i:i+klen]
		v = int(d.get(s,0))
		d[s]=v+1

	c+=winlen

#print d
s = "";
for x in d:
	if(d.get(x)>=occurs):
		s=s+x+" "

print s
