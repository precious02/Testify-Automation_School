# Use for loop to iterate from 0 to 10
# For each iteration print out "Number ", i
# If the i value is equal to 2 add the continue
# If the i value is equal to 8 add the break statement

preshNumber = 10
for i in range(preshNumber):

    if i == 2:
        continue
    if i == 8:
        break
    print('Number', i)
