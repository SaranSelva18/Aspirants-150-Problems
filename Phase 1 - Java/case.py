n=100
count=0
for i in range(2,n+1):
    for j in range(2,n+1):
        if i%j==0:
            break
    if i==j:
        count+=1
print(count)