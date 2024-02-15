# Create a function that filters out negative numbers

numbers = [-2, -60, 9, 8, 7, -54, -79, -4]


def positive_num(number):
    return [num for num in numbers if num >= 0]


print(positive_num(numbers))


