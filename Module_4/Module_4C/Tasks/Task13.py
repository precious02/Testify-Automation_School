# Create a function that prints out "Hello World"
# Invoke the same function in it own body
# Invoke the function outside the function block


def hello():
    print('Hello World')
    hello()


hello()
