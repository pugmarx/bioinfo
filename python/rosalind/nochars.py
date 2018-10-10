import sys
s = sys.stdin.readline()
a=0
c=0
g=0
t=0
a=s.count('A',0,len(s))
c=s.count('C',0,len(s))
g=s.count('G',0,len(s))
t=s.count('T',0,len(s))
print 'A:' + str(a)
print 'C:' + str(c)
print 'G:' + str(g)
print 'T:' + str(t)
